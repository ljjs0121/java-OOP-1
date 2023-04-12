package sample7;

import util.KeyboardReader;
// ProductStore 클래스는 메뉴 기능
public class ProductStore {
	
	private KeyboardReader reader = new KeyboardReader();
	private ProductStoreService service = new ProductStoreService();
	
	public void menu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1.조회 2.등록 3. 수정 4.삭제 5.입고 6.출고 0.종료");
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		System.out.println("### 메뉴선택 > ");
		int menuNo = reader.readInt();
		System.out.println();
		
		if (menuNo == 1) {
			조회하기();
		} else if (menuNo == 2) {
			등록하기();
		} else if (menuNo == 3) {
			수정하기();
		} else if (menuNo == 4) {
			삭제하기();
		} else if (menuNo == 5) {
			입고하기();
		} else if (menuNo == 6) {
			출고하기();
		} else if (menuNo == 0) {
			종료하기();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		menu();		// 재귀호출 .. 메뉴선택이 계속 뜨게 하는 코드
		
	}
	
	private void 조회하기() {
		System.out.println("<< 상품 정보 조회>>");
		
		// 모든 상품정보가 저장되어 있는 배열객체를 조회한다.
		Product[] products = service.getAllProducts();
		
		// products 참조변수가 참조하는 배열객체에 저장된 모든 상품정보를 출력하기
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t상품명\t제조회사\t카테고리\t가격\t재고량\t판매여부");
		System.out.println("--------------------------------------------------------");
		for (Product product : products) {
			if (product == null ) {
				break;
			}
			System.out.print(product.getNo() + "\t");
			System.out.print(product.getName() + "\t");
			System.out.print(product.getMaker() + "\t");
			System.out.print(product.getCategory() + "\t");
			System.out.print(product.getPrice() + "\t");
			System.out.print(product.getStock() + "\t");
			System.out.println(product.isOnsell());
		}
		
	}
	
	private void 등록하기() {
		System.out.println("<< 신규 상품 정보 등록>>");
		
		// 키보드 입력으로 신규 상품 정보를 읽어온다.
		System.out.println("### 신규 상품정보를 입력하세요.");
		System.out.print("### 상품이름 입력: ");
		String name = reader.readString();
		System.out.print("### 제조회사 입력: ");
		String maker = reader.readString();
		System.out.print("### 카테고리 입력: ");
		String category = reader.readString();
		System.out.print("### 상품가격 입력: ");
		int price = reader.readInt();
		System.out.print("### 입고수량 입력: ");
		int stock = reader.readInt();
		
		// Product객체를 생성해서 신규 상품정보를 저장한다.
		Product product = new Product();
		product.setName(name);
		product.setMaker(maker);
		product.setCategory(category);
		product.setPrice(price);
		product.setStock(stock);
		product.setOnsell(true);
		
		// ProductStoreService객체의 insertProduct(Product product) 메소드를 실행시켜서 신규 상품정보를 배열에 저장시킨다.
		service.insertProduct(product);
		
		System.out.println("[완료] 신규 상품정보가 등록되었습니다.");
		
	}
	
	private void 수정하기() {
		System.out.println("<< 상품 정보 수정>>");
		
		System.out.println("### 상품정보 수정에 필요한 정보를 입력하세요.");
		System.out.print("### 상품번호 입력: ");
		int no =reader.readInt();
		System.out.print("### 상품이름 입력: ");
		String name = reader.readString();
		System.out.print("### 제조회사 입력: ");
		String maker = reader.readString();
		System.out.print("### 카테고리 입력: ");
		String category = reader.readString();
		System.out.print("### 상품가격 입력: ");
		int price = reader.readInt();
		
		// Product객체를 생성해서 수정할 정보를 저장한다.
		Product product = new Product();
		// 수정한 정보들을 product에 저장한다.
		product.setNo(no);
		product.setName(name);
		product.setMaker(maker);
		product.setCategory(category);
		product.setPrice(price);
		
		// service 메소드 updateProduct에서 수정한 정보가 담긴 product를 반환한다.
		service.updateProduct(product);
		System.out.println("### 상품정보 수정이 완료되었습니다.");
		
	}
	
	
	private void 삭제하기() {
		System.out.println("<< 상품 정보 삭제>>");
		
		System.out.println("### 삭제할 상품번호를 입력하세요.");
		System.out.print("### 상품번호 입력: ");
		int productNo =reader.readInt();
		
		service.deleteProduct(productNo);
		System.out.println("### 상품정보 삭제가 완료되었습니다.");
	}
	
	private void 입고하기() {
		System.out.println("<< 상품 입고>>");
		
		System.out.println("### 입고된 상품의 번호와 입고수량을 입력하세요.");
		System.out.println("### 상품번호입력: ");
		int productNo = reader.readInt();
		System.out.println("### 입고수량입력: ");
		int amount = reader.readInt();
		
		// productService객체의 importProduct(int productNo, int amount) 메소드를 실행시킨다.
		service.importProduct(productNo, amount);
		System.out.println("### 상품입고처리가 완료되었습니다.");
		
	}
	
	private void 출고하기() {
		System.out.println("<< 상품 출고>>");
		System.out.println("### 출고할 상품의 번호와 출고수량을 입력하세요.");
		System.out.println("### 상품번호 입력: ");
		int productNo = reader.readInt();
		System.out.println("### 출고수량 입력: ");
		int amount = reader.readInt();
		
		service.exportProduct(productNo, amount);
		System.out.println("### 상품출고처리가 완료되었습니다.");
		
	}
	
	private void 종료하기() {
		System.out.println("<< 프로그램 종료 >>");
		System.exit(0);
	}
}
