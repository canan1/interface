package Entities;

	public class Gamer extends Customer {
		private String userName;

		public Gamer(String userName) {
			super();
			this.userName = userName;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
}
