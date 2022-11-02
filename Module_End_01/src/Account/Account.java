/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 30-Oct-2022 7:50:03 PM
*/

package Account;
public class Account {
		String accountNumber;
		String name;
		String email;
		String phone;
		double balance;
		Enum accountType;
		
		public Account() {
		}
		
		public Account(String accountNumber, String name, String email, String phone, double balance,
				Enum accountType) {
			this.accountNumber = accountNumber;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.balance = balance;
			this.accountType = accountType;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Enum getAccountType() {
			return accountType;
		}

		public void setAccountType(Enum accountType) {
			this.accountType = accountType;
		}

		@Override
		public String toString() {
			return "Account [accountNumber=" + accountNumber + ", name=" + name + ", email=" + email + ", phone="
					+ phone + ", balance=" + balance + ", accountType=" + accountType + "]";
		}
				
	}