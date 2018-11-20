# Chuẩn bị

* Tạo mới Java project. Do mình đang làm quen với **Maven**, nên mình tạo project sử dụng **Maven** luôn. Điểm lợi là configure library dễ dàng, không cần phải tải file **.jar** về rồi **Configure Build Path**
* Configure sử dụng **JUnit** và **Hamcrest** để lát viết unit test

# Tạo class Anagrams và AnagramsTest

## Tạo class Anagrams để viết code đảo vị trí các ký tự

Thêm hàm `anagramsOf`, là hàm chính mà mình sẽ code, trả về null cho IDE khỏi báo lỗi
```java
public static List<String> anagramsOf(String str) {
    return null;
}
```

## Tạo class AnagramsTest để viết các unit test cho class Anagrams

Đầu tiên mình thêm hàm test để test với chuỗi nhập vào là "ab"

```java
@Test
public void test1() {
    List<String> expected = Arrays.asList("ab", "ba");
    List<String> actual = Anagrams.anagramsOf("ab");

    assertThat(actual, containsInAnyOrder(expected.toArray()));
}
```

# Chạy test phát nhỉ :D

Dùng lệnh `mvn test` để run các unit test vừa viết ở trên. Kết quả là màn hình đỏ lòm vì mình chưa implement gì cả. Giờ mình sẽ đi implement sao cho không đỏ lòm nữa

# Code lần 1

Đáng lẽ phải code theo hiểu hard code trước, sau đó mới sửa dần thành code pro hơn. Nhưng do mình quen tay rồi, mình thích dùng `for` hơn, nên mình code đại 1 đoạn. Sau đó chạy unit test để sao cho pass

```java
public static List<String> anagramsOf(String str) {
    List<String> result = new ArrayList<String>();

    for (int index = 0; index < str.length(); index++) {
        String charAtIndex = String.valueOf(str.charAt(index));
        String charOfRest = str.substring(0, index) + str.substring(index + 1, str.length());
        result.add(charAtIndex + charOfRest);
    }

    return result;
}
```

# Thêm case test với chuỗi "abc"

```java
@Test
public void test2() {
    List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
    List<String> actual = Anagrams.anagramsOf("abc");

    assertThat(actual, containsInAnyOrder(expected.toArray()));
}
```

# Lại test

Nhọ ghê, không pass với case 2

# Tổng kết

Cứ lặp đi lặp lại các bước như vậy cho tới khi các test pass hết các case là được. Ban đầu mới làm thì rất lâu do chưa biết cách viết unit test, chưa thể viết đầy đủ các test case ngay từ lần đầu tiên, cách viết code chưa ngon ngay. Nhưng sau qua thời gian, mình sẽ rút ngắn thời gian đi, chất lượng code tốt hơn.