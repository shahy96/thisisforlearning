package projectForGit;

public class DeadLock {
	public static String s1 = "spoon";
	public static String s2 = "fork";

	public static class thread1 extends Thread {
		public void run() {
			synchronized (s1) {
				System.out.println("Thread1 has " + s1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread1 waiting for " + s2 + "....................................");
				synchronized (s2) {
					System.out.println("Thread1 has " + s2);
					System.out.println("Thread 1 Completed!!!!!!!!!!!!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}

	public static class thread2 extends Thread {
		public void run() {
			synchronized (s2) {
				System.out.println("Thread2 has " + s2);

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread2 waiting for " + s1 + "....................................");
				synchronized (s1) {
					System.out.println("Thread2 has " + s1);
					System.out.println("Thread 2 Completed!!!!!!!!!!!!!");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1 = new thread1();
		t1.start();

		thread2 t2 = new thread2();
		t2.start();
	}

}
