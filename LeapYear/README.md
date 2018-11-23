# Tạo class LeapYear và LeapYearTest

## Tạo class LeapYear và method để kiểm tra 1 số nhập vào có phải là năm nhuận không

Vẫn như bình thường, mình tạo 1 method và return đại 1 giá trị để IDE không báo lỗi

```java
public static boolean isLeapYear(int year) {
    return false;
}
```

## Tạo class LeapYearTest

Viết 4 test case theo đề bài gợi ý

```
1996 => true
2001 => false
2000 => true
1900 => false
```

# Run `mvn test` xem có lỗi không nào

Đương nhiên là lỗi rồi :D :D :D. Sang bước sau, implement sao cho không lỗi

# Bước chập chững "đầu đời" ^^

Mình nhớ 1 công thức đơn giản là năm nào mà chia hết cho 4 thì là năm nhuận. Vậy cứ implement đại đã nhể ;)

```java
public static boolean isLeapYear(int year) {
    boolean isLeapYear = false;

    if (year % 4 == 0) {
        isLeapYear = true;
    }

    return isLeapYear;
}
```

# Lại `mvn test` phát

Hay quá, 4 case còn fail 1 thôi :((((

# Bổ sung thêm điều kiện kiểm tra như đề bài gợi ý

Đề bài gợi ý kiểm tra 1 năm là năm nhuận khi
* Chia hết cho 4 và không chia hết cho 100
* Hoặc chia hết cho 400

```java
public static boolean isLeapYear(int year) {
    boolean isLeapYear = false;

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        isLeapYear = true;
    }

    return isLeapYear;
}
```

Đến đây là ngon rồi, chỉ còn viết code gọn lại và test để đảm bảo code vẫn đúng là oki :D

# Cải tiến

Có thể viết thêm 1 method để kiểm tra 1 số chia hết cho 1 số khác, khi đọc code sẽ dễ hiểu hơn