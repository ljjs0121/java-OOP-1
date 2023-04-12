package sample7;
// Setter 이용해서 Setter 값 출력해보기
public class ProductApp {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		p1.setNo(1);
		p1.setName("맥북 M1");
		p1.setMaker("애플");
		p1.setCategory("노트북");
		p1.setPrice(1_500_000);
		p1.setStock(5);
		p1.setOnsell(true);
		
		// Setter에 저장된 값을 Getter로 출력
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t상품명\t제조회사\t카테고리\t가격\t재고량\t판매여부");
		System.out.println("--------------------------------------------------------");
		System.out.print(p1.getNo() + "\t");
		System.out.print(p1.getName() + "\t");
		System.out.print(p1.getMaker() + "\t");
		System.out.print(p1.getCategory() + "\t");
		System.out.print(p1.getPrice() + "\t");
		System.out.print(p1.getStock() + "\t");
		System.out.println(p1.isOnsell() + "\t");
	}
}
