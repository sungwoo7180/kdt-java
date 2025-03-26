package primitiveandreference;

public class StringSample {
    String myString = "myString";
    String byteString = "10";
    byte fromStringByte = Byte.parseByte(byteString);
    String trueString = "true";
    String falseString = "false";
    boolean fromStringBool = Boolean.parseBoolean(falseString);

    String floatString = "10.123";
    String floatString2 = "10.123";     //String의 경우 같은 값이라면 중복 생성 x, 기존에 있던 것을 재사용함.
    //String은 new 없이도 heap 영역에 할당 될 수 있고, 같은 값이라면 중복으로 생성 되는것이 아니라 재사용이 가능하게 함.
    String floatString3 = new String("10.123");     // new를 굳이 사용 할 필요가 없다고 경고 표시가 뜬다.
    // 기존에 string풀에 있어도 무시하고 새로 만듬
    float fromLiteral = 10.123f;
    float fromStringFloat = Float.parseFloat(floatString);
    long fromLiteralLong= 10000000L;
}
