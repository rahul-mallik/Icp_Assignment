package com.companytry;

import java.util.Scanner;

public class AffineChiper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the msg:  ");
        String msg = sc.next();

        System.out.print("Enter the multiplicative key: ");
        int mk = sc.nextInt();

        System.out.print("Enter the additive key: ");
        int ak = sc.nextInt();

        String encrypted_msg = encrypt(msg,mk,ak);
        String decrypted_msg = decrypt(encrypted_msg,mk,ak);

        System.out.println("Message "+msg+" after encryption is "+encrypted_msg);
        System.out.println("Message "+encrypted_msg+" after Decryption is "+decrypted_msg);
    }



    public static char[] plain_array(){
        //to get the num value of plaintext
        char[] plaintext = new char[26];
        for(int i = 0 ; i<=25;i++){
            plaintext[i]=(char)('a'+i);
        }
        return plaintext;
    }
    public static char[] cipher_array(){
        //to get the num value of ciphertext
        char[] ciphertext = new char[26];
        for(int i = 0 ; i<=25;i++){
            ciphertext[i]=(char)('A'+i);
        }
        return ciphertext;
    }
    public static int multi_inverse(int m_key) {
        int mi=1;
        for(int i = 1 ; ; i++) {
            if ((m_key*i)%26 ==1) {
                mi = i;
                break;
            }
        }
        return (mi);
    }

    public static String encrypt(String msg, int m_key, int a_key){
        String enc_msg ="";

        char [] plaintext = plain_array();
        char [] ciphertext = cipher_array();

        for(int i =0; i<msg.length();i++){
            char P1 = msg.charAt(i);
            int P = 0;
            for(int c =0; c<plaintext.length ; c++){
                if (plaintext[c] == P1 ){
                    P = c;
                    break;
                }
            }
            int encryption = (P*m_key+a_key)%26;
            enc_msg += ciphertext[encryption];
        }
        return enc_msg;
    }

    public static String decrypt(String decrypted, int m_key, int a_key){
        String org_msg ="";

        char [] plaintext = plain_array();
        char [] ciphertext = cipher_array();

        for(int i =0; i<decrypted.length();i++){
            char C1 = decrypted.charAt(i);
            int C = 0;
            for(int c =0; c<ciphertext.length ; c++){
                if (ciphertext[c] == C1 ){
                    C = c;
                    break;
                }
            }
            int decryption = ((C-a_key)*multi_inverse(m_key))%26;
            if(decryption<0) {
                int t = decryption+26;
                org_msg += plaintext[t];
            }
            else
                org_msg += plaintext[decryption];
        }
        return org_msg;
    }
}