package InterviewPreparation.Misc;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
A SHA fingerprint is a unique cryptographic string (like a digital signature) generated from a file or security certificate
using a Secure Hash Algorithm (such as SHA-1 or SHA-256). It acts as a fixed-size, tamper-proof ID to verify software identity,
app authenticity, and file integrity.
 */
public class FileFingerPrinter {

    public static String getFileFingerPrint(String filePath) throws NoSuchAlgorithmException, IOException {
        //Change "SHA-256" to "MD5" or "SHA-1" if needed
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        try(FileInputStream fis = new FileInputStream(filePath)) {
            byte[] byteArray = new byte[1024];
            int bytesCount;

            //Read File data and update the digest
            while ((bytesCount = fis.read(byteArray)) != -1) {
                digest.update(byteArray,0,bytesCount);
            }
        }
        //convert the byte array into hexadecimal format
        byte[] bytes = digest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x",b));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        try {
            //String path = "https://github.com/jyotinew2027-LearningAndGrowth/Data-Structures/blob/main/README.md";
            String path = "F://Java Projects/springaidemo/Data-Structures/SHATest.txt";
            String fingerprint = getFileFingerPrint(path);
            System.out.println("SHA-256 File Fingerprint :: " + fingerprint);
            //file - README.md : SHA-256 File Fingerprint :: c66beba1a62ea0bf62159e2b552d3593b123f54ed6fe30c6a3847a3100124656
            //file -SHATest.txt :SHA-256 File Fingerprint :: 185f8db32271fe25f561a6fc938b2e264306ec304eda518007d1764826381969
            //file -SHATest.txt :SHA-256 File Fingerprint :: 1aeab64e644b8b84048232e8faa7ed61576744f4381b80f1d66be36a8c3801f5
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
