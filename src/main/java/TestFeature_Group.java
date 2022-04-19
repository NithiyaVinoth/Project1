import org.testng.annotations.Test;

public class TestFeature_Group {

	public class Group {
		@Test(groups = "Fruits")
		private void Apple() {
			System.out.println("Apple");
		}

		@Test(groups = "Vegetables")
		private void Carrot() {
			System.out.println("Carrot");
		}

		@Test(groups = "Fruits")
		private void Banana() {
			System.out.println("Banana");
		}

		@Test(groups = "Vegetables")
		private void Beetroot() {
			System.out.println("Beetroot");
		}

		@Test(groups = "Fruits")
		private void orange() {
			System.out.println("orange");
		}

		@Test(groups = "Vegetables")
		private void Pumpkin() {
			System.out.println("Pumpkin");
		}

		@Test(groups = "Junk")
		private void Pizza() {

			System.out.println("Pizza");
		}

		@Test(groups = "Vegetables")
		private void Beans() {
			System.out.println("Beans");
		}

		@Test(groups = "Junk")
		private void Burgur() {
			System.out.println("Burgur");
		}

	}
}
