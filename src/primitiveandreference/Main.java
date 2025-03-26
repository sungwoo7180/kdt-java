package primitiveandreference;

public class Main {
    public static void main(String[] args) {
        byte myByte = 1;            //8bit
        short myShort = 1;          //16bit
        char myChar = 'a';          //16bit
        //char myChar = "B";        // 문자열을 char로 받을 수는 없다.

        int myInteger = 1;          //32bit
        long myLong = 1;            //64bit

        Byte myWrappedByte = myByte;
        boolean isEqual1 = myWrappedByte.equals(1);
        boolean isEqual2 = myWrappedByte.equals(myByte);
        System.out.println("같은 값인가요? " + isEqual1);
        System.out.println("같은 값인가요? " + isEqual2);

        //타입 변환
        long fromByteMyLong = myByte;           //자동 형 변환

        byte lossfromLong = (byte)myLong;       //데이터의 손실을 감안하고 타입 변환을 하겠다. 강제, 명시적 형 변환

        int intfromByte = myByte + myByte;
        //byte sumByte = myByte + myByte;

        System.out.println(myByte);
        System.out.println(intfromByte);


    }
}
