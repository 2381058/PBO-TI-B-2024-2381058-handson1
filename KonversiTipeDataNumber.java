public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        int tipeDataInteger = -129;
        byte tipeDataByte2 = (byte) tipeDataInteger;
        System.out.println(tipeDataByte2);
        String firstName, lastName;
        firstName = "William";
        lastName = "Govert";

        System.out.printf("%s %s", firstName, lastName);

    }
}
