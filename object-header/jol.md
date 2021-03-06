
## Print object layout
```
  <dependency>
    <groupId>org.openjdk.jol</groupId>
    <artifactId>jol-core</artifactId>
  </dependency>
```

```
import org.openjdk.jol.info.ClassLayout;

public class ObjHeaderDemo {
  static Object l=new Object();

  public static void main(String[] args) {
    System.out.println(ClassLayout.parseInstance(l).toPrintable());
  }
}

```