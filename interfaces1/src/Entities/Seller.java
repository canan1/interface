package Entities;

	public class Seller extends Customer {
		private String Number;

		public Seller(String number) {
			super();
			Number = number;
		}

		public String getNumber() {
			return Number;
		}

		public void setNumber(String number) {
			Number = number;
		}
}
