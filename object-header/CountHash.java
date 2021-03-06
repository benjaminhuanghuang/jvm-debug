import java.lang.reflect.Field;

import sun.misc.Unsafe;


/*
  Calculate hash code 
*/
public class CountHash {
  static Object l = new Object();
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
      System.out.println(Integer.toHexString(l.hashCode()));

      countHash(l);
   }

   public static void countHash(Object obj) throws NoSuchFieldException, IllegalAccessException{
    Field field = Unsafe.class.getDeclaredField("theUnsafe");
    field.setAccessible(true);
    Unsafe unsafe = (Unsafe) field.get(null);
    long hashCode = 0;
    for(int i =7 ; i > 0;i --)
    {
      // Read MarkWord
      hashCode |= (unsafe.getByte(obj, i) & 0xFF) << (i -1) *8;
    }
    String code = Long.toHexString(hashCode);
    System.out.println(code);
   }
}
