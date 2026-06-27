Отличные вопросы по теории Java! Вот ответы:

***

## 1. Что такое компилятор и для чего он нужен?

**Компилятор** — это специальная программа, которая переводит текст программы, написанный на языке программирования (высокий уровень), в набор машинных кодов или байт-код (низкий уровень), понятный компьютеру. [javarush](https://javarush.com/quests/lectures/questsyntax.level00.lecture05)

### В Java:
| Характеристика | Описание |
|---|---|
| **Название** | `javac` (команда компилятора) |
| **Вход** | Файлы `.java` (исходный код) |
| **Выход** | Файлы `.class` (байт-код)  [easiio](https://www.easiio.com/ru/easiio-compiler-java/) |
| **Входит в** | JDK (Java Development Kit)  [javarush](https://javarush.com/quests/lectures/jru.module1.lecture10) |

### Для чего нужен:
- Переводит код программиста на языке Java в **байт-код** [javarush](https://javarush.com/quests/lectures/questsyntax.level00.lecture05)
- Байт-код не зависит от платформы и может быть выполнен на любой системе с JVM [easiio](https://www.easiio.com/ru/easiio-compiler-java/)
- Позволяет реализовать принцип Java: **"написать один раз, запустить где угодно"** [easiio](https://www.easiio.com/ru/easiio-compiler-java/)

**Пример:**
```bash
javac Main.java  # Компиляция: Main.java → Main.class
```

***

## 2. Чем отличается JRE от JDK и JVM

Это три взаимосвязанные компоненты платформы Java с разной функциональностью:

### Таблица отличий:

| Понятие | Расшифровка | Для чего нужно | Содержит | Включает компилятор |
|---|---|---|---|---|
| **JVM** | Java Virtual Machine | Выполнение байт-кода | Виртуальная машина | ❌ Нет  [w3schools](https://w3schools.tech/ru/tutorial/java/java-jdk-jre-jvm) |
| **JRE** | Java Runtime Environment | Запуск Java-программ | JVM + библиотеки Java | ❌ Нет  [ravesli](https://ravesli.com/jdk-jre-jvm-java/) |
| **JDK** | Java Development Kit | Разработка Java-программ | JRE + инструменты разработки | ✅ Да  [ravesli](https://ravesli.com/jdk-jre-jvm-java/) |

### Визуальная схема (вложенность):
```
JDK (наибольшее)
 └── JRE
      └── JVM (наименьшее)
```

### Подробное объяснение:

**JVM (Java Virtual Machine)**: [ravesli](https://ravesli.com/jdk-jre-jvm-java/)
- Виртуальная машина Java
- Выполняет только байт-код (файлы `.class`)
- Не может напрямую запустить исходный код Java [javarush](https://javarush.com/quests/lectures/jru.module1.lecture10)
- Платформенно-зависимая (для каждой ОС своя JVM)

**JRE (Java Runtime Environment)**: [ru.stackoverflow](https://ru.stackoverflow.com/questions/1503081/%D0%92-%D1%87%D1%91%D0%BC-%D1%80%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-jdk-jre-%D0%B8-jvm)
- Среда выполнения Java
- **jre = jvm + библиотеки** [ru.stackoverflow](https://ru.stackoverflow.com/questions/1503081/%D0%92-%D1%87%D1%91%D0%BC-%D1%80%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-jdk-jre-%D0%B8-jvm)
- Нужна **для запуска уже готовых программ**, но не для разработки [ru.stackoverflow](https://ru.stackoverflow.com/questions/1503081/%D0%92-%D1%87%D1%91%D0%BC-%D1%80%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-jdk-jre-%D0%B8-jvm)
- Не включает компилятор [ravesli](https://ravesli.com/jdk-jre-jvm-java/)

**JDK (Java Development Kit)**: [w3schools](https://w3schools.tech/ru/tutorial/java/java-jdk-jre-jvm)
- Комплект разработки Java
- **JDK = JRE + инструменты разработки** (компилятор `javac`, документация, дебаггер и др.) [ravesli](https://ravesli.com/jdk-jre-jvm-java/)
- Нужен для **разработки** Java-программ [ravesli](https://ravesli.com/jdk-jre-jvm-java/)
- Включает компилятор [w3schools](https://w3schools.tech/ru/tutorial/java/java-jdk-jre-jvm)

### Кому что нужно:
- **Только запускать Java-программы** → JRE
- **Разрабатывать Java-программы** → JDK (рекомендуется для вас!)
- JVM устанавливается автоматически в составе JRE/JDK


Отличные вопросы для подготовки! Вот ответы:

***

## 1. Какие типы данных есть в Java?

В Java есть **два основных типа данных**: [wiki.merionet](https://wiki.merionet.ru/articles/tipy-dannyx-v-java)

### 🔹 Примитивные типы (Primitive Types) — 8 типов [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list)
| Тип | Описание |
|---|---|
| `byte` | Целое число (1 байт)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |
| `short` | Целое число (2 байта)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |
| `int` | Целое число (4 байта)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |
| `long` | Целое число (8 байт)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |
| `float` | Число с плавающей точкой (4 байта)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |
| `double` | Число с плавающей точкой двойной точности (8 байт)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |
| `char` | Символ Unicode (2 байта)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |
| `boolean` | Логический тип (true/false)  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |

### 🔹 Ссылочные типы (Reference Types) [skillbox](https://skillbox.ru/media/base/tipy-dannykh-v-java/)
- `String` — строки
- Классы (например, `Car`, `Vehicle`)
- Интерфейсы
- Массивы
- Enum

***

## 2. Числовые типы данных и объём занимаемого места

### Целочисленные типы:

| Тип | Объём памяти (байты) | Диапазон значений  [it.kgsu](https://it.kgsu.ru/JA_OS/ja_os003.html) |
|---|---|---|
| `byte` | **1 байт** | От -128 до 127  [it.kgsu](https://it.kgsu.ru/JA_OS/ja_os003.html) |
| `short` | **2 байта** | От -32768 до 32767  [it.kgsu](https://it.kgsu.ru/JA_OS/ja_os003.html) |
| `int` | **4 байта** | От -2¹⁴⁷483648 до 2¹⁴⁷483647  [math.wikireading](https://math.wikireading.ru/3311) |
| `long` | **8 байт** | От -9²²3372036854775808 до 9²²3372036854775807  [code-basics](https://code-basics.com/ru/languages/java/lessons/data-types-list) |

### Типы с плавающей точкой:

| Тип | Объём памяти (байты) | Диапазон значений  [it.kgsu](https://it.kgsu.ru/JA_OS/ja_os003.html) |
|---|---|---|
| `float` | **4 байта** | ±3.4×10³⁸ (6-7 значащих цифр)  [it.kgsu](https://it.kgsu.ru/JA_OS/ja_os003.html) |
| `double` | **8 байт** | ±1.8×10³⁰⁸ (15 значащих цифр)  [math.wikireading](https://math.wikireading.ru/3311) |

**Важно:** `char` технически тоже числовой тип (2 байта), но используется для символов. [kata](https://kata.academy/blog/java/peremennye-i-tipy-dannyh-v-java)

***

## 3. Что делает оператор break?

**`break`** (переводится как "останавливать, прерывать") — оператор, который **прерывает выполнение цикла** или `switch`. [vertex-academy](https://vertex-academy.com/tutorials/ru/operator-break-java/)

### Основные функции:

| Использование | Описание  [vertex-academy](https://vertex-academy.com/tutorials/ru/operator-break-java/) |
|---|---|
| **В циклах** | Прерывает цикл в любой момент, раньше чем он должен завершиться  [vertex-academy](https://vertex-academy.com/tutorials/ru/operator-break-java/) |
| **В switch** | Заканчивает текущий case и выходит из оператора switch  [vertex-academy](https://vertex-academy.com/tutorials/ru/operator-break-java/) |
| **Вложенные циклы** | Прерывает только **внутренний** (самый ближайший) цикл  [otus](https://otus.ru/nest/post/666/) |

### Пример с циклом:

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Цикл прерывается, когда i = 5
    }
    System.out.println(i);  // Выведит: 0, 1, 2, 3, 4
}
```

### Пример с switch:

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Понедельник");
        break;  // Выход из switch
    case 2:
        System.out.println("Вторник");
        break;  // Выход из switch
    case 3:
        System.out.println("Среда");
        break;  // Выход из switch
}
```

### Ключевые правила: [otus](https://otus.ru/nest/post/666/)
- `break` работает одинаково для всех циклов: `while`, `for`, `do...while` [vertex-academy](https://vertex-academy.com/tutorials/ru/operator-break-java/)
- Нельзя использовать `break` за пределами цикла или `switch` [otus](https://otus.ru/nest/post/666/)
- После `break` управление передаётся следующему оператору после цикла/switch [proglang](https://proglang.su/java/operator-break)


Отличные вопросы! Вот ответы:

***

## 1. Какие разновидности цикла while вы знаете? Чем отличаются эти циклы?

В Java есть **три разновидности циклов while**: [alexgyver](https://alexgyver.ru/lessons/while/)

### 🔹 Цикл `while` (цикл с предусловием) [alexgyver](https://alexgyver.ru/lessons/while/)

```java
while (условие) {
    // код цикла
}
```

**Как работает:**
1. Сначала проверяется условие
2. Если условие `true` — выполняется код
3. После выполнения — возвращается к проверке условия [skillbox](https://skillbox.ru/media/code/izuchaem_c_chast_6_tsikly_while_do_while_i_for/)

**Особенность:** Цикл может **не выполниться ни разу**, если условие изначально `false` [alexgyver](https://alexgyver.ru/lessons/while/)

**Пример:**
```java
int i = 0;
while (i < 5) {
    System.out.println(i);  // Выведит: 0, 1, 2, 3, 4
    i++;
}
```

***

### 🔸 Цикл `do-while` (цикл с постусловием) [skillbox](https://skillbox.ru/media/code/izuchaem_c_chast_6_tsikly_while_do_while_i_for/)

```java
do {
    // код цикла
} while (условие);
```

**Как работает:**
1. Сначала **выполняется код** (как минимум 1 раз)
2. Затем проверяется условие
3. Если условие `true` — повторяется [alexgyver](https://alexgyver.ru/lessons/while/)

**Особенность:** Цикл **всегда выполняется как минимум один раз**, даже если условие `false` [skillbox](https://skillbox.ru/media/code/izuchaem_c_chast_6_tsikly_while_do_while_i_for/)

**Пример:**
```java
int i = 0;
do {
    System.out.println(i);  // Выведит: 0, 1, 2, 3, 4
    i++;
} while (i < 5);
```

***

### 📊 Сравнение:

| Характеристика | `while` | `do-while`  [alexgyver](https://alexgyver.ru/lessons/while/) |
|---|---|---|
| **Сначала** | Проверяется условие | Выполняется код |
| **Минимум итераций** | 0 (может не выполниться) | 1 (всегда выполнится) |
| **Порядок** | условие → код | код → условие |
| **Куда переходит `continue`** | К проверке условия | К проверке условия |

**Важно:** `continue` в `do-while` переносит выполнение к условию (не выше, как в обычном `while`). [alexgyver](https://alexgyver.ru/lessons/while/)

***

## 2. Что такое массив?

**Массив** — это структура данных, которая хранит **набор элементов одного типа** в непрерывной области памяти. [skillbox](https://skillbox.ru/media/code/izuchaem_c_chast_6_tsikly_while_do_while_i_for/)

### Особенности массива в Java:

| Характеристика | Описание |
|---|---|
| **Один тип** | Все элементы массива имеют одинаковый тип (например, `int[]` — только целые числа) |
| **Фиксированный размер** | Размер массива определяется при создании и не меняется |
| **Индексация** | Элементы нумеруются от `0` до `length-1` |
| **Доступ** | По индексу: `array[0]`, `array [alexgyver](https://alexgyver.ru/lessons/while/)` и т.д. |

### Пример создания массива:

```java
// Создание массива int
int[] numbers = new int [msiter](https://msiter.ru/tutorials/javascript/js_for_while);  // Массив на 5 элементов
numbers[0] = 10;
numbers [alexgyver](https://alexgyver.ru/lessons/while/) = 20;
numbers [pythonworld](https://pythonworld.ru/osnovy/cikly-for-i-while-operatory-break-i-continue-volshebnoe-slovo-else.html) = 30;

// Или с инициализацией
int[] ages = {15, 20, 25, 30};  // length = 4
```

### Доступ к элементам:

```java
int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr[0]);  // Выведит: 1
System.out.println(arr.length);  // Выведит: 5 (размер массива)
```

***

## 3. Что делает оператор continue?

**`continue`** (переводится как "продолжить") — оператор, который **прерывает текущую итерацию цикла** и **возвращается к началу цикла** (к проверке условия). [skillbox](https://skillbox.ru/media/code/izuchaem_c_chast_6_tsikly_while_do_while_i_for/)

### Как работает:

| Шаг | Описание  [alexgyver](https://alexgyver.ru/lessons/while/) |
|---|---|
| 1 | При выполнении `continue` остающийся код текущей итерации **пропускается** |
| 2 | Цикл **не прерывается**, а переходит к следующей итерации |
| 3 | Переход идёт к проверке условия (для `while`) или к следующей итерации (для `for`) |

### Пример:

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;  // Пропускает i = 2, переходит к следующей итерации
    }
    System.out.println(i);  // Выведит: 0, 1, 3, 4 (НЕ 2)
}
```

### С `do-while`:

```java
int i = 0;
do {
    if (i == 2) {
        continue;  // Переход К условию while, не выше
    }
    System.out.println(i);  // Выведит: 0, 1, 3, 4
    i++;
} while (i < 5);
```

**Важно:** В `do-while` `continue` переносит выполнение на условие `while`, а не в начало блока. [alexgyver](https://alexgyver.ru/lessons/while/)

### Ключевое правило: [alexgyver](https://alexgyver.ru/lessons/while/)
- `continue` относится к **ближайшему** (внутреннему) циклу, в котором находится

***

## 4. Что делает оператор break в цикле?

**`break`** — оператор, который **полностью прерывает цикл** и **покидает его**. [skillbox](https://skillbox.ru/media/code/izuchaem_c_chast_6_tsikly_while_do_while_i_for/)

### Как работает:

| Шаг | Описание  [alexgyver](https://alexgyver.ru/lessons/while/) |
|---|---|
| 1 | При выполнении `break` цикл **немедленно завершается** |
| 2 | Весь оставшийся код цикла **не выполняется** |
| 3 | Управление передаётся следующему оператору **после цикла** |

### Пример:

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Цикл прерывается, когда i = 5
    }
    System.out.println(i);  // Выведит: 0, 1, 2, 3, 4 (НЕ 5, 6, 7, 8, 9)
}
```

### Пример с условием:

```java
int i = 5;
while (i > 0) {
    i -= 1;
    if (i == 2) {
        break;  // Цикл завершается, когда i = 2
    }
    System.out.println(i);  // Выведит: 4, 3 (НЕ 2, 1, 0)
}
```

### Ключевые правила: [ravesli](https://ravesli.com/urok-70-operatory-break-i-continue/)

| Правило | Описание |
|---|---|
| **Внутри цикла** | `break` завершает только цикл, в котором находится |
| **Вложенные циклы** | В `break` прерывает только **внутренний** (ближайший) цикл  [alexgyver](https://alexgyver.ru/lessons/while/) |
| **В `switch`** | `break` внутри `switch` завершает `case`, а не цикл  [alexgyver](https://alexgyver.ru/lessons/while/) |
| **После `break`** | Управление передаётся оператору после цикла |

### Вложенные циклы: [alexgyver](https://alexgyver.ru/lessons/while/)

```java
while (true) {          // #1 внешний цикл
    while (true) {      // #2 внутренний цикл
        break;          // Завершит #2 (внутренний), НЕ #1
    }
    break;              // Завершит #1 (внешний)
}
```

***

## 📊 Сравнение `break` и `continue`:

| Оператор | Что делает | Цикл продолжается? |
|---|---|---|
| **`break`** | Полностью завершает цикл | ❌ Нет |
| **`continue`** | Пропускает текущую итерацию | ✅ Да (следующая итерация) |

**Пример сравнения:**

```java
// break:
for (int i = 0; i < 5; i++) {
    if (i == 2) break;
    System.out.println(i);  // 0, 1
}

// continue:
for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    System.out.println(i);  // 0, 1, 3, 4
}
```

Отличные вопросы по основам Java! Вот подробные ответы:

***

## 1. Что такое класс?

**Класс** — это **план (чертёж, структура)** для создания объектов в Java. Он определяет:
- Какие **поля (атрибуты)** будут у объектов
- Какие **методы (действия)** они могут выполнять

### Пример класса:

```java
public class Car {
    // Поля (атрибуты)
    String name;
    int age;
    
    // Методы (действия)
    public void drive() {
        System.out.println("Машина едет");
    }
}
```

**Класс = структура данных + поведение** [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

***

## 2. Что такое объект?

**Объект** — это **конкретный экземпляр класса**, созданный по плану класса.

### Различие:

| Класс | Объект |
|---|---|
| Чертёж машины | Конкретная машина Toyota |
| Абстрактное понятие | Реальный предмет в памяти |
| Существует в коде | Существует в памяти (heap)  [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/) |

### Пример:

```java
// Класс
public class Car {
    String name;
}

// Объекты (конкретные машины)
Car car1 = new Car();  // car1 - объект класса Car
Car car2 = new Car();  // car2 - другой объект класса Car
```

**Объект хранится в heap (куче)** [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/)

***

## 3. Что такое конструктор по умолчанию?

**Конструктор по умолчанию** — это конструктор, который **JVM создаёт автоматически**, если вы не пишете никаких конструкторов в классе. [youtube](https://www.youtube.com/watch?v=sfDFZPE9tuw)

### Характеристики:

| Характеристика | Описание  [youtube](https://www.youtube.com/watch?v=sfDFZPE9tuw) |
|---|---|
| **Имя** | Такое же как у класса |
| **Параметры** | Нет параметров |
| **Доступ** | public (если класс public) |
| **Что делает** | Создаёт объект, не делая ничего особенного |

### Пример:

```java
// Вы не пишете конструктор
public class Car {
    String name;
}

// JVM автоматически создаёт:
public Car() {
    // Пустой конструктор по умолчанию
}
```

### Если вы пишете свой конструктор:

```java
public class Car {
    String name;
    
    // Свой конструктор с параметрами
    public Car(String name) {
        this.name = name;
    }
}

// Конструктор по умолчанию НЕ создаётся автоматически!
```

***

## 4. Как создать объект в Java?

Объект создается с помощью **оператора `new`**: [youtube](https://www.youtube.com/watch?v=mqpMjw6cqe0)

### Синтаксис:

```java
// 1. Создаем объект и сразу даем имя переменной
Car car = new Car();

// 2. Создание объекта с конструктором с параметрами
Car car2 = new Car("Toyota");

// 3. Можно создать без имени переменной
new Car().drive();  // Создали и сразу вызвали метод
```

### Полная запись:

```java
// Тип_объекта  имя_переменной = новый(новый тип)(параметры);
Car car = new Car();       // Создание объекта
Toyota myCar = new Toyota();  // Другой объект
```

**Ключевые моменты:**
- `new` — создаёт объект в heap [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/)
- Переменная (`car`) хранит **ссылку** на объект в heap [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java)
- Конструктор вызывается автоматически при создании [youtube](https://www.youtube.com/watch?v=sfDFZPE9tuw)

***

## 5. Что такое heap? Что хранится в heap? Что такое Stack? Что хранится в stack?

### 🔹 Heap (Куча) [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java)

| Характеристика | Описание |
|---|---|
| **Что это** | Область памяти для **объектов**  [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/) |
| **Что хранит** | **Все объекты** (не ссылки)  [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java) |
| **Когда создаётся** | При запуске JVM |
| **Управление** | Автоматическое (Garbage Collection)  [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/) |
| **Доступ** | Глобальный (из любой части программы)  [youtube](https://www.youtube.com/watch?v=mqpMjw6cqe0) |

**В heap хранятся:**
- Все объекты, созданные через `new` [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java)
- Экземпляры классов с их полями [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java)
- Классы [youtube](https://www.youtube.com/watch?v=mqpMjw6cqe0)

### 🔸 Stack (Стек) [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/)

| Характеристика | Описание |
|---|---|
| **Что это** | Область памяти для **локальных переменных**  [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/) |
| **Что хранит** | Примитивы (`int`, `boolean`) и **ссылки на объекты**  [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java) |
| **Когда создаётся** | При вызове метода |
| **Управление** | Автоматическое (FIFO - первый вошёл, первый вышел)  [youtube](https://www.youtube.com/watch?v=mqpMjw6cqe0) |
| **Доступ** | Только внутри метода  [youtube](https://www.youtube.com/watch?v=mqpMjw6cqe0) |

**В stack хранятся:**
- Локальные переменные методов [youtube](https://www.youtube.com/watch?v=mqpMjw6cqe0)
- Параметры методов [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/)
- Ссылки на объекты в heap [youtube](https://www.youtube.com/watch?v=mqpMjw6cqe0)
- Фреймы методов [javatutor](https://javatutor.eu/%D0%BA%D0%B0%D0%BA-java-%D1%85%D1%80%D0%B0%D0%BD%D0%B8%D1%82-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B/)

### 📊 Важное отличие:

```java
public void example() {
    int age = 25;           // Примитив в STACK
    Car car = new Car();    // car (ссылка) в STACK, объект Car в HEAP
}
```

| Переменная | Где хранится | Что хранится |
|---|---|---|
| `age` | Stack | Значение `25`  [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java) |
| `car` | Stack | Ссылка на объект |
| Объект `Car` | Heap | Сам объект с полями  [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java) |

**Визуально:**

```
     STACK (Стек)               HEAP (Куча)
┌─────────────────┐      ┌─────────────────┐
│ car → [ссылка]  │ ────▶│  [объект Car]   │
│ age = 25        │      │  name = "Toyota"│
└─────────────────┘      │  age = 5        │
                         └─────────────────┘
```

***

## 6. Какие модификаторы доступа вы знаете и как они работают?

В Java есть **4 модификаторы доступа**: [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

| Модификатор | Класс | Пакет | Наследование | Внешний мир |
|---|---|---|---|---|
| `private` | ✅ Только в своём классе | ❌ | ❌ | ❌ |
| `default` (нет модификатора) | ✅ | ✅ В том же пакете | ✅ | ❌ |
| `protected` | ✅ | ✅ | ✅ В наследниках | ✅ В наследниках |
| `public` | ✅ | ✅ | ✅ | ✅ Весь мир |

### Подробное описание:

#### 🔸 `private` — самый ограниченный [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

```java
public class Car {
    private String name;  // Только в классе Car
    
    public void setName(String name) {
        this.name = name;  // Внутри класса можно
    }
}

// Вне класса нельзя:
Car car = new Car();
car.name = "Toyota";  // ❌ ОШИБКА: name has private access
```

**Используется для:** защиты данных класса

***

#### 🔸 `default` (без модификатора) — доступ по пакету [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

```java
// package: com.example
public class Car {
    String name;  // default - нет модификатора
}

// В том же пакете:
Car car = new Car();
car.name = "Toyota";  // ✅ Можно
```

**Используется для:** элементов, доступных только внутри пакета

***

#### 🔸 `protected` — доступ для наследников [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

```java
public class Vehicle {
    protected String name;  // Доступ в пакете + наследникам
}

public class Car extends Vehicle {
    public void printName() {
        System.out.println(name);  // ✅ Можно (наследник)
    }
}
```

**Используется для:** элементов, которые нужны наследникам

***

#### 🔸 `public` — самый открытый [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

```java
public class Car {
    public String name;  // Доступен из любого класса
    
    public void drive() {
        System.out.println("Едет");
    }
}

// В любом месте:
Car car = new Car();
car.name = "Toyota";  // ✅ Можно
car.drive();          // ✅ Можно
```

**Используется для:** методов и полей, которые должны быть доступны всем

***

## 7. Для чего нужен класс String?

**String** — класс для работы с **строками (текстом)** в Java. [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

### Основные функции:

| Функция | Описание |
|---|---|
| **Сохранение текста** | Хранит строковые значения |
| **Методы для работы** | `length()`, `charAt()`, `substring()`, `equals()` и др. |
| **Неизменяемость** | `String` — immutable (не меняется после создания) |

### Пример:

```java
String text = "Hello, World!";

// Методы String
int length = text.length();           // 14
char first = text.charAt(0);          // 'H'
String sub = text.substring(0, 5);    // "Hello"
boolean equal = text.equals("Hello"); // false
```

**Важно:** Строки хранятся в special области памяти (String Constant Pool) [ru.stackoverflow](https://ru.stackoverflow.com/questions/325000/stack-%D0%B8-heap-%D0%B2-java)

***

## 8. Что такое статический вложенный класс?

**Статический вложенный класс (static nested class)** — класс, объявленный внутри другого класса с модификатором `static`. [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

### Особенности:

| Характеристика | Описание |
|---|---|
| **Объявление** | `static class InnerClass` внутри внешнего класса |
| **Доступ к внешнему** | Не может обращаться к полям внешнего класса напрямую |
| **Создание** | `OuterClass.InnerClass obj = new OuterClass.InnerClass();` |

### Пример:

```java
public class OuterClass {
    private String outerField = "Outer";
    
    // Статический вложенный класс
    public static class InnerClass {
        public void print() {
            // Нельзя: System.out.println(outerField);  // ❌ ОШИБКА
            System.out.println("Inner static");
        }
    }
}

// Создание:
OuterClass.InnerClass inner = new OuterClass.InnerClass();
inner.print();
```

**Используется для:** группировки классов, логически связанных с внешним

***

## 9. Что такое вложенный класс?

**Вложенный класс (Inner Class / Nested Class)** — класс, объявленный внутри другого класса. [ru.scribd](https://ru.scribd.com/document/987275345/Java-Basic-Questions-V-4-1)

### Виды вложенных классов:

| Тип | Объявление | Доступ к внешнему |
|---|---|---|
| **Static nested class** | `static class Inner` | ❌ Нет |
| **Inner class** | `class Inner` | ✅ Да (к любым полям) |
| **Local class** | Внутри метода | ✅ Да |
| **Anonymous class** | Без имени | ✅ Да |

### Пример обычного вложенного класса (Inner Class):

```java
public class OuterClass {
    private String outerField = "Outer";
    
    // Обычный вложенный класс (не static)
    public class InnerClass {
        public void print() {
            System.out.println(outerField);  // ✅ Можно!
        }
    }
}

// Создание:
OuterClass outer = new OuterClass();
OuterClass.InnerClass inner = outer.new InnerClass();
inner.print();  // Выведет: Outer
```

### Ключевое отличие от static nested class:

| Характеристика | Inner Class | Static Nested Class |
|---|---|---|
| **static** | ❌ Нет | ✅ Да |
| **Доступ к outer** | ✅ Полный | ❌ Нет |
| **Создание** | `outer.new Inner()` | `new Outer.Inner()` |

***

Все вопросы проработаны! Удачи в изучении Java! 🎉