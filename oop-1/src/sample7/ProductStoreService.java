package sample7;

import java.util.concurrent.atomic.AtomicInteger;

// 기능 메소드
public class ProductStoreService {

	private Product[] repo = new Product[100];
	private int position = 0; // 각 상품 정보의 저장 위치를 알려주는 변수
	private AtomicInteger atomicInteger = new AtomicInteger(1001); // 정수 카운터 역할하는 자바의 클래스
	
	public ProductStoreService() {
		repo[position++] = new Product(atomicInteger.getAndIncrement(), "아이폰", "애플", "스마트폰", 1_200_000);
		repo[position++] = new Product(atomicInteger.getAndIncrement(), "아이패드", "애플", "태블릿", 700_000);
		repo[position++] = new Product(atomicInteger.getAndIncrement(), "맥북M1", "애플", "노트북", 1_800_000);
		repo[position++] = new Product(atomicInteger.getAndIncrement(), "s22", "삼성", "스마트폰", 1_300_000);
		repo[position++] = new Product(atomicInteger.getAndIncrement(), "그램", "LG", "노트북", 1_500_000);
	}
	
	// 신규 상품정보 등록기능 >> 등록,추가,수정,삭제는 값을 반환하지 않아도 되서 반환값은 void
	/*
	 * 신규 상품등록정보를 전달받아서 배열에 저장시킨다. 
	 * 반환타입 : void
	 * 메소드이름 : insertProduct
	 * 매개변수 : Product product
	 * 구현내용 : 상품정보를 전달받아서 배열에 저장시킨다.
	 */
	public void insertProduct(Product product) {
		// 신규 상품번호를 조회홰서 Product객체에 저장시킨다.
		int no = atomicInteger.getAndIncrement();
		product.setNo(no);
		
		repo[position] = product;
		position++;
	}
	
	// 모든 상품정보를 반환하는 기능
	/*
	 * 모든 상품정보가 저장된 배열객체를 반환한다.
	 * 반환타입 : Product[]
	 * 메소드이름 : getAllProducts
	 * 매개변수 : 없음
	 * 구현내용 : 모든 상품정보가 저장된 배열객체의 주소값을 반환한다.
	 */
	public Product[] getAllProducts() {
		return repo;
	}
	
	// 상품정보 수정기능 void
	/*
	 * 수정할 상품정보(상품번호, 상품이름, 제조회사, 카테고리, 가격)를 전달받아서 반영시킨다.
	 * 반환타입 : void
	 * 메소드명 : updateProduct
	 * 매개변수 : Product updatedProduct
	 * 구현내용 : 수정할 상품정보와 일치하는 상품정보를 배열에서 조회한다.
	 * 			조회된 상품정보에 수정할 상품정보를 대입한다.
	 */
	public void updateProduct(Product updatedProduct) {
		for (Product product : repo) {
			if (product == null) {
				break;
			}
			// 배열에서 상품번호가 일치하는 상품정보를 조회해서 상품정보에 수정된 상품정보를 대입한다.
			if (product.getNo() == updatedProduct.getNo()) { // no는 상품을 찾기 위해 사용한 것이다.
				product.setName(updatedProduct.getName());
				product.setCategory(updatedProduct.getCategory());
				product.setPrice(updatedProduct.getPrice());
				product.setMaker(updatedProduct.getMaker());
				// 일치하는 상품정보를 찾아서 수정을 완료했기 때문에 반복문을 탈출한다.
				break;
			}
		}
	}
	
	// 상품정보 삭제기능 void
	/*
	 * 상품번호를 전달받아서 상품정보를 삭제를 한다.
	 * 타입 : void
	 * 메소드이름 : deleteProduct
	 * 매개변수 : int productNo
	 * 구현내용 : 상품번호에 해당하는 상품 정보를 삭제한다.
	 * 			상품번호에 해당하는 상품정보가 배열의 몇번째 index에 저장되어 있는지 조회한다.
	 * 			조회된 index 다음 번부터 position번째까지 상품정보를 전부 한칸씩 앞으로 이동시킨다.
	 */
	public void deleteProduct(int productNo) {
		// 삭제할 상품번호와 일치하는 상품정보가 저장된 배열의 인덱스를 저장할 변수다.
		int findIndex = -1; // 0 으로 안한 이유는 0으로 했을때 배열의 index가 0부터 있기때문에 못찾았을 때 0으로 나왔는지 모르기때문에 나올수없는 -1로 설정했다
		// 상품번호에 해당하는 상품정보가 배열의 몇번째 index에 저장되어 있는지 조회한다.
		// 배열에서 상품번호가 일치하는 상품을 찾으면 해당 상품이 저장된 인덱스를 findIndex에 대입한다.
		for (int index = 0; index < position; index++) {
			Product product = repo[index];
			if (product.getNo() == productNo) {
				findIndex = index;
				break;
			}
		}
		
		// findIndex가 -1이 아닌 경우는 상품번호에 해당하는 상품정보를 발견했고 
		// 해당 상품정보가 저장된 위치가 findIndex에 대입되어 있는 경우다.
		if (findIndex != -1) {
			// 삭제할 상품이 저장된 위치 바로 다음부터 마지막 상품이 저장된 위치까지
			// 한칸씩 앞으로 이동시킨다.
			for (int i = findIndex + 1; i < position; i++) {
				repo[i - 1] = repo[i];
			}
			// 맨 마지막번째 상품이 저장되어 있던 위치의 배열의 값을 null로 변경한다.
			repo[position -1] = null;
			// 다음 저장위치를 나타내는 position값을 1감소시킨다.
			position--;
		}
	}
	
	// 입고 기능
	/*
	 * 상품번호와 입고수량을 전달받아서 입고처리한다.
	 * 타입 : void
	 * 메소드이름 : importProduct
	 * 매개변수 : int productNo, int amount
	 * 구현내용 : 배열에서 상품번호에 해당하는 상품정보를 조회한다.
	 * 			상품정보의 재고수량을 입고수량만큼 증가시킨다.
	 * 			상품정보의 판매여부를 true로 변경한다.
	 */
	public void importProduct(int productNo, int amount) {
		for (Product product : repo) {
			if (product == null) {
				break;
			}
			if (product.getNo() == productNo) {
				product.setStock(product.getStock() + amount);
				product.setOnsell(true);
				break;
			}
		}
	}
	
	// 출고 기능
	/*
	 * 상품번호와 출고수량을 전달받아서 입고처리한다.
	 * 타입 : void
	 * 메소드명 : exportProduct
	 * 매개변수 : int productNo, int amount
	 * 구현내용 : 배열에서 상품번호에 해당하는 상품정보를 조회한다.
	 * 			상품정보의 재고수량을 출고수량만큼 감소시킨다.
	 * 			상품정보의 재고수량이 0이 되면 판매상태를 false로 설정한다.
	 * 
	 * 
	 */
	
	public void exportProduct(int productNo, int amount) {
		for (Product product : repo) {
			if (product == null) {
				break;
			}
			// 상품번호가 일치하는 상품정보를 조회한다.
			if (product.getNo() == productNo) {
				// 상품정보의 현재 재고량을 출고량과 비교해서 재고수량이 충분한 경우와 부족한 경우로 나누어서 출고처리한다.
				if (product.getStock() >= amount) {
					// 재고수량이 충분한 경우에는 재고량에서 출고수량을 뺀 값을 재고량으로 대입한다.
					product.setStock(product.getStock() - amount); 
				} else {
					// 재고수량이 부족한 경우에는 부족한 수량을 미리 계산하고, 재고수량을 0으로 설정한 다음, 메세지를 출력한다.
					int gap = amount - product.getStock(); // amount 출고량 getStock 재고량 
					product.setStock(0);
					System.out.println("재고량 부족으로 ["+gap+"]개 미출고 되었습니다.");
				}
				// 남은 재고량이 0일때 판매여부는 false로 대입한다.
				if (product.getStock() == 0) {
					product.setOnsell(false);
				}
				break;
			}
		}
	}
}
