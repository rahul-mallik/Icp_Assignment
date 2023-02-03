import java.util.Scanner;

import java.util.Scanner;

public class AffineChiper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the msg: ");
        String msg = in.next();

        System.out.print("Enter the multiplicative key: ");
        int mk = in.nextInt();

        System.out.print("Enter the additive key: ");
        int ak = in.nextInt();

        String encrypted_msg = encrypt(msg,mk,ak);
        String decrypted_msg = decrypt(encrypted_msg,mk,ak);

        System.out.println("Message "+msg+" after encryption is "+encrypted_msg);
        System.out.println("Message "+msg+" after Decryption is "+decrypted_msg);
    }



    public static String encrypt(String msg, int multiplicative_key, int additive_key){
        String enc_msg ="";

        //to get the num value of plaintext
        char[] plaintext = new char[26];
        for(int i = 0 ; i<=25;i++){
            plaintext[i]=(char)('a'+i);
        }

        //to get the num value of ciphertext
        char[] ciphertext = new char[26];
        for(int i = 0 ; i<=25;i++){
            ciphertext[i]=(char)('A'+i);
        }

        for(int i =0; i<msg.length();i++){
            char P1 = msg.charAt(i);
            int P = 0;
            for(int c =0; c<plaintext.length ; c++){
                if (plaintext[c] == P1 ){
                    P = c;
                    break;
                }
            }
            int encryption = (P*multiplicative_key+additive_key)%26;
            enc_msg += ciphertext[encryption];
        }
        return enc_msg;
    }



    public static String decrypt(String decrypted, int multiplicative_key, int additive_key){
        String org_msg ="";

        //to get the num value of plaintext
        char[] plaintext = new char[26];
        for(int i = 0 ; i<=25;i++){
            plaintext[i]=(char)('a'+i);
        }

        //to get the num value of ciphertext
        char[] ciphertext = new char[26];
        for(int i = 0 ; i<=25;i++){
            ciphertext[i]=(char)('A'+i);
        }

        for(int i =0; i<decrypted.length();i++){
            char C1 = decrypted.charAt(i);
            int C = 0;
            for(int c =0; c<ciphertext.length ; c++){
                if (ciphertext[c] == C1 ){
                    C = c;
                    break;
                }
            }
            int decryption = ((C-additive_key)/multiplicative_key)%26;
            org_msg += plaintext[decryption];
        }
        return org_msg;
    }
}
