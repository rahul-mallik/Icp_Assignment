public class Hq5 {
    public static void main(String[] args) {
        
        /*Write a java program to exchange the value of 4 variables W,G,K,A such that the value of 
        W will move to A, A to K, K to G and finally G to W. Exchange using with and without 
        using extra variables*/

        // 1st method
        int W = 1, G = 2, K = 3, A = 4, x; // Any value of ur choice..
		
		System.out.println("Before Swapping: \nW:" + W + "\nG:" + G + "\nK:" + K + "\nA:" + A);
		x = A;
		A = W;
		W = G;
		G = K;
		K = x;
		System.out.println("\nAfter Swapping: \nW:" + W + "\nG:" + G + "\nK:" + K + "\nA:" + A);
        
        // 2nd Method 
        W = 12;
        A = 45;
        K = 69;
        G = 2;

        System.out.println("\nBefore Swapping: \nW:" + W + "\nG:" + G + "\nK:" + K + "\nA:" + A);
		A = A + K + G + W;
		K = A - (K+G+W);	
		G = A - (K+G+W);	
		W = A - (K+G+W);	
		A = A - (K+G+W);
		System.out.println("\nAfter Swapping: \nW:" + W + "\nG:" + G + "\nK:" + K + "\nA:" + A);


        /*
         Output of method 1
            Before Swapping: 
            W:1
            G:2
            K:3
            A:4

            After Swapping: 
            W:2
            G:3
            K:4
            A:1
         */
        /*
         Output of method 2
            Before Swapping: 
            W:12
            G:2
            K:69
            A:45

            After Swapping: 
            W:2
            G:69
            K:45
            A:12
         */
        

    }
}
