problem one:
```java
E:\androidProject\TurboImage\lib_jpeg_turbo\src\main\java>javah -jni com.salton123.jpeg.JpegTurbo
错误: 无法确定Bitmap的签名
```
resolve:

```
E:\androidProject\TurboImage\lib_jpeg_turbo\src\main\java>javah -cp E:\android\sdk\platforms\android-28\android.jar; -jni com.salton123.jpeg.JpegTurbo

```