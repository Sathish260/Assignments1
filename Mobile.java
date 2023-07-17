package julyday1;

public class Mobile {
	
		public void sendMessage() {
			System.out.println("Send message");
		}
		private void shareDocument() {
			System.out.println("Share Document");
		}
		protected void makeCall() {
			System.out.println("Make Call");	
		}
		
		
		public static void main(String[] args) {
			Mobile Mobile=new Mobile();
		    Mobile.sendMessage();
		    Mobile.shareDocument();
		    Mobile.makeCall();
		  
		    
		} 
	}

