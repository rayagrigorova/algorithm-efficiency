<h1 align="center">Tasks</h1>

## 11. Задачи

1. Напишете програма, която подканва потребителя да въведе два низа и тества дали вторият низ се съдържа в първия низ. (Не използвайте indexOf метод в класа String, защото неговата сложност е допълнително натоварваща) Анализирайте сложността на вашия алгоритъм. Ето примерно изпълнение на програмата:

```
Enter a string s1: Mississippi
Enter a string s2: sip
matched at index 6
```

2. Напишете програма, която подканва потребителя да въведе низ и показва максимално нарастващата последователност от символи (не е задължително тези символи да са непосредствено един до друг).. Анализирайте сложността на вашата програма. Ето примерно изпълнение (имайки предвид, че ASCII кода на главна буква е по-малко число от този на малка буква):

```
Enter a string: Welcome
Welo
```

## 12. Задачи

Изгледайте видеото с интервю за работа в Google от Модул 2 плейлиста. Решете задачата дадена там по четирите начина, които са предложени от интервюирания.
1. С два вложени цикъла, които проверяват всяка с всяка стойност **T(n) = O(n^2)**
2. С двоично търсене за всеки елемент от масива **T(n) = O(nlog(n))**
3. Варианта, работещ **само за подреден масив**. Сравнявайки двата най-отдалечени елемента и местейки долната или горната граница в зависимост от необходимостта. **T(n) = O(n)**
4. Варианта, работещ за **произволен по подредба масив**, използващ HashSet **T(n) = O(n)**
За да разберете защо последното решение работи толкова добре, е важно да знаете, че **добавяне и търсене на елемент в HashSet има сложност O(1)**. За справка вижте таблицата по-долу

![ASJvj1RkPtCmmsbW4l4BRWVy94-esfH_dQMy5PiZDeJBjxxrG7lBaXuaduWOI8vX4AmI0J0ofg8EzPaJsAKEMk1QLlzBEPSwaiP7sp_f1ydZzOHMEFeRqYiD6rr69XUstREHhsXJetF56FYpiucLBA](https://github.com/rayagrigorova/algorithm-efficiency/assets/72023155/46af339e-f4f1-4abe-8727-8568a11cf667)

## 13. Задачи

1. Изведете сложността на метода на мехурчето, следвайки примерите от презентацията
2. Оптимизирайте анимацията, така че да не продължава да сравнява елементите, ако масивът е сортиран, следвайки логиката от последния слайд презентацията
3. По желание: Запълнете с цвят вече подредените елементи от масива
4. По желание: Създайте анимация, която онагледява Selection или Insertion sort

## 14. Задачи

1. Напишете следните два темплейтни метода, използвайки сортиране чрез сливане. Първият метод сортира елементите, използвайки интерфейса Comparable, а вторият използва Comparator.

```java
public static <E extends Comparable<E>> void mergeSort(E[] list)
public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
```

2. Напишете програма, която засича времето за изпълнение на сортиране чрез пряка селекция, сортиране чрез метода на мехурчето, сортиране чрез сливане и бързо сортиране на масиви с размери 50 000 и 100 000. Вашата програма трябва да създава данни за масивите на случаен принцип. Отпечатайте информацията в следния или подобен формат, така че да се види нарастването във времето при различните видове сортиране спрямо нарастването на обема информация

![mvTs1yWnl5XVqTQ02xhBlGGe_iS5pHVG9gQKcBYqWSfxxBajyo29QXjzD_vZPWu1iQykmWu4M1_Aq8r9T0zic_WSWu30sEmq3QTBlpoz3T2RxgnLZC6ZbH2jWoqhLN9qVEpeubzqF19mEeMrgHp_RQ](https://github.com/rayagrigorova/algorithm-efficiency/assets/72023155/3fd51940-8207-47d1-924b-192873058d6b)
