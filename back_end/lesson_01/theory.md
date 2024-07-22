<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Lesson 01

### Multithreading. Introduction

Multithreading is one of the options for multitasking. Creating a new thread in the application,
is equivalent to creating a new stack of functions. That is, in a multi-threaded application, several stacks can work simultaneously.

You can create a new task in Java either by implementing the Runnable interface or by extending the Thread class.
In any case, you need to override the run method in which the new task will be implemented.

In order for a new thread to start, you need to create an object of type Thread by passing an object of type Runnable to the constructor,
and then call the start method on an object of type Thread.

If it is necessary for one thread to wait for the completion of another thread, then while the first thread is running,
You need to call the join method on the old thread object.

1. **Processes and Threads**
- Definition and difference between process and thread.
-
- **Process** is an instance of a program running on the operating system.
  Each process has its own address space, including memory, file handles, and other resources.

- **A thread** is the smallest unit of execution within a process.
  Threads in the same process share its address space and resources.

- Processes are independent units with their own resources.

- Threads are subtasks within a process that share shared resources.

- Difference between threads and processes in terms of information, memory usage and switching speed.
- Processes:
  They are isolated from each other and have their own address spaces and resources.
  Creating and switching context is more memory and time consuming.

- Streams:
  They share the address space and resources of one process.
  Creating and switching context is less memory and time consuming.

These differences make processes more suitable for performing independent tasks that require isolation and protection, while threads are better suited for tasks that require frequent communication and fast switching.

2. **Demon threads** are usually tasks that run **in the background throughout the entire life cycle of the application**.

They automatically terminate their work, along with the termination of the last non-daemon thread.
You can create a thread daemon as follows: thread.setDeamon(true). This must be done before the start of the thread.
The static sleep method puts the thread into sleep mode for the specified number of milliseconds.
During this time, the thread does not participate in the allocation of processor resources.

The **interrupt** method called on a thread changes its interrupted flag (field) to true. In accordance with the contract, it is customary to respond to a flag change with the InterruptedException exception.

During the operation of an application, it may be necessary to provide exclusive access to a method or part of the code.
That is, only one thread should work with this part of the code at a time.

This can be done by specifying the **synchronized** keyword in the method signature, or by wrapping the desired part of the code in a synchronized block.


### **Creating and running threads in Java**
In Java, threads can be created in two ways: by inheriting from the `Thread` class or by implementing the `Runnable` interface.

- **Example with inheritance from the Thread class:**

 ```java
 class MyThread extends Thread {
 public void run() {
 System.out.println("Thread started: " + Thread.currentThread().getName());
 }
 }

 public class Main {
 public static void main(String[] args) {
 MyThread thread = new MyThread();
 thread.start();
 }
 }
 ```

- **Example with implementation of the Runnable interface:**

 ```java
 class MyRunnable implements Runnable {
 public void run() {
 System.out.println("Thread started: " + Thread.currentThread().getName());
 }
 }

 public class Main {
 public static void main(String[] args) {
 Thread thread = new Thread(new MyRunnable());
 thread.start();
 }
 }
 ```

### **Thread control:**
- The `start()` method starts a thread, while the `run()` call simply executes the code in the current thread.
- You can set thread priorities using the `setPriority()` method, which affects the allocation of CPU time between threads.
- Daemon threads are service threads that do not prevent the JVM from shutting down.
- The `join()` method allows one thread to wait for another thread to complete.
- Suspending the execution of a thread can be implemented using `Thread.sleep()`



### The join() method in Java

#### Introduction to join()
The `join()` method in Java allows one thread to wait for another thread to complete. This is especially useful in multi-threaded programs where one thread must wait for other threads to complete before continuing execution. This method blocks the current thread until the target thread on which `join()` was called terminates.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Lesson 01

###  Многопоточность. Введение

Multithreading один из вариантов многозадачности. Создание нового треда в аплликации, 
равносильно созданию нового стека функций. Т. е. в многопоточной аппликации могут одновременно работать несколько стеков.

Создать новую задачу в Java можно или имплементировав интерфейс Runnable, или рсширяя класс Thread. 
В любой случае надо переопределить метод run в котором и будет реализована новая задача.

Чтобы новый тред стартовал, надо создать объект типа Thread передав в конструктор объект типа Runnable, 
и после этого вызвать у объекта типа Thread метод start.

Если необходимо, чтобы один тред дождался завершения другого треда, то в процессе работы первого треда, 
надо у объекта сторого треда вызвать метод join.

1. **Процессы и потоки**
   - Определение и различие между процессом и потоком.
     -
     - **Процесс** — это экземпляр программы, выполняемой в операционной системе. 
     Каждый процесс имеет свой собственный адресное пространство, включая память, дескрипторы файлов и другие ресурсы.
     
     - **Поток** — это наименьшая единица выполнения внутри процесса. 
     Потоки одного процесса разделяют его адресное пространство и ресурсы.

  - Процессы - это независимые единицы с собственными ресурсами.

  - Потоки - это подзадачи внутри процесса, использующие общие ресурсы.

  - Разница между потоками и процессами в контексте информации, использования памяти и скорости переключения.
    - Процессы:
      Изолированы друг от друга, имеют собственные адресные пространства и ресурсы.
      Создание и переключение контекста более затратные по памяти и времени.
    
    - Потоки:
      Разделяют адресное пространство и ресурсы одного процесса.
      Создание и переключение контекста менее затратные по памяти и времени.
    
      Эти различия делают процессы более подходящими для выполнения независимых задач, требующих изоляции и защиты, в то время как потоки лучше подходят для задач, требующих частого взаимодействия и быстрого переключения.

2. **Демон треды**, обычно представляют из себя задачи работающие **в фоновом режиме на протяжении всего жизненного цикла аппликации**. 

Они автоматически завершают свою работу, вместе с завершением работы последнего не демон треда. 
Создать демон тред можно следующим образом: thread.setDeamon(true). Сделать это необходимо до старта треда.
Статический метод sleep переводит тред в режим ожидания на заданное колличество миллисекунд. 
На протяжении этого времени тред не учавствует в распределении ресурсов процессора.

Метод **interrupt** вызванный у треда, меняет его флаг(поле) interrupted на true. В соответствии с контрактом принято реагировать на изменение флага эксепшеном InterruptedException.

В процессе работы аппликации, бывает необходимо обеспечить эксклюзивный доступ к методу, или части кода. 
Т. е. единомоментно с этой частью кода должен работать только один тред. 

Сделать это можно указав ключевое слово **synchronized** в сигнатуре метода, или обернув нужную часть кода в synchronized блок.


###  **Создание и запуск потоков в Java**
   В Java потоки можно создавать двумя способами: наследуясь от класса `Thread` или реализуя интерфейс `Runnable`.

   - **Пример с наследованием от класса Thread:**

     ```java
     class MyThread extends Thread {
         public void run() {
             System.out.println("Поток запущен: " + Thread.currentThread().getName());
         }
     }

     public class Main {
         public static void main(String[] args) {
             MyThread thread = new MyThread();
             thread.start();
         }
     }
     ```

   - **Пример с реализацией интерфейса Runnable:**

     ```java
     class MyRunnable implements Runnable {
         public void run() {
             System.out.println("Поток запущен: " + Thread.currentThread().getName());
         }
     }

     public class Main {
         public static void main(String[] args) {
             Thread thread = new Thread(new MyRunnable());
             thread.start();
         }
     }
     ```

###  **Управление потоками:**
   - Метод `start()` запускает поток, в то время как вызов `run()` просто выполняет код в текущем потоке.
   - Можно устанавливать приоритеты потоков, используя метод `setPriority()`, что влияет на распределение времени процессора между потоками.
   - Потоки-демоны (`daemon threads`) — это служебные потоки, которые не препятствуют завершению работы JVM.
   - Метод `join()` позволяет одному потоку ожидать завершения работы другого потока.
   - Приостановка выполнения потока может быть реализована с помощью `Thread.sleep()`



### Метод join() в Java

#### Введение в join()
Метод `join()` в Java позволяет одному потоку ожидать завершения другого потока. Это особенно полезно в многопоточных программах, где один поток должен дождаться завершения других потоков перед продолжением выполнения. Этот метод блокирует текущий поток до тех пор, пока целевой поток, на котором был вызван `join()`, не завершится.

#### Примеры использования метода join()

##### Пример 1: Синхронизация счетчика
```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class MyRunnable implements Runnable {
    private final Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new MyRunnable(counter));
        Thread thread2 = new Thread(new MyRunnable(counter));
        thread1.start();
        thread2.start();
        try {
            thread1.join(); // thread1 finish and join main
            thread2.join(); // thread2 finish and join main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + counter.getCount()); 
    }
}
```
В этом примере два потока увеличивают счетчик в общем объекте `Counter`. Главный поток дожидается их завершения, используя `join()`, прежде чем выводить СВОЁ значение счетчика.

##### Пример 2: Подсчет суммы в потоках
```java
class MyThread extends Thread {
    private int result;

    public void run() {
        result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }
    }

    public int getResult() {
        return result;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        int result = thread1.getResult() + thread2.getResult();
        System.out.println("Result: " + result);
    }
}
```
Здесь два потока вычисляют сумму чисел, а главный поток ожидает их завершения, чтобы суммировать их результаты.


## Синхронизация потоков в Java

### Проблемы многопоточности
- Последовательность выполнения действий в разных потоках может привести к неожиданным результатам.
- Параллельный доступ к общим ресурсам без должной синхронизации может вызвать гонки данных (race conditions) и привести к неправильному поведению программы.
- Взаимные блокировки и неравномерное распределение ресурсов между потоками могут снижать производительность и приводить к ошибкам.

### Синхронизация потоков
- Синхронизация в Java предоставляет механизмы для упорядочивания доступа потоков к общим ресурсам.
- Ключевое слово `synchronized` используется для определения блоков кода или методов, которые должны быть защищены от одновременного доступа нескольких потоков.

#### Методы синхронизации
1. **Модификатор `synchronized` для методов:**
   ```java
   public synchronized void method() {
       // Тело метода
   }
   ```
   Когда поток вызывает синхронизированный метод, он захватывает монитор объекта (или класса, если метод статический).

2. **Синхронизированный блок внутри методов:**
   ```java
   public void method() {
       synchronized(this) {
           // Тело синхронизированного блока
       }
   }
   ```
   Синхронизированный блок позволяет уточнить объект, монитор которого будет использован для блокировки.

### Примеры синхронизации
#### Проблема синхронизации счётчика
- Рассмотрим проблему, когда несколько потоков инкрементируют одну и ту же переменную. Без синхронизации конечное значение переменной будет непредсказуемым из-за race conditions.

#### Синхронизация с использованием `synchronized`
- Добавление `synchronized` к методу `increaseCounter` гарантирует, что каждый поток будет увеличивать счетчик последовательно, обеспечивая правильный итоговый результат.


### Избегание блокировок (Deadlocks)
- Важно проектировать многопоточные приложения таким образом, чтобы избежать взаимных блокировок, когда два или более потоков ждут ресурсы, захваченные друг другом, создавая тем самым состояние вечного ожидания.

### Рекомендации по синхронизации
- Используйте синхронизацию экономно, чтобы не снизить производительность приложения.
- При проектировании многопоточных приложений всегда учитывайте возможность возникновения состояний гонки, взаимных блокировок и других проблем многопоточности.
- Изучайте и используйте высокоуровневые абстракции и утилиты для многопоточности из пакета `java.util.concurrent`, которые могут помочь упростить разработку многопоточных приложений и сделать ее более надежной.


### `ExecutorService` в Java 
Это фреймворк, предоставляемый пакетом `java.util.concurrent`, который упрощает управление потоками. Вместо того чтобы вручную управлять потоками, вы можете использовать `ExecutorService`, чтобы эффективно управлять пулом потоков.

Когда вы создаете экземпляр `ExecutorService` в Java, происходит ряд внутренних действий, которые организуют управление потоками и задачами. Давайте подробно рассмотрим, что происходит при создании `ExecutorService`, как работает пул потоков, что такое пул задач, и как потоки активируются.

### Создание `ExecutorService`

Когда вы вызываете, например, `Executors.newFixedThreadPool(int nThreads)`, происходит следующее:

1. **Инициализация пула потоков**: Создается пул потоков с фиксированным числом потоков (`nThreads`). Это означает, что в любой момент в пуле не будет более `nThreads` активных потоков.

2. **Создание потоков**: Потоки создаются и управляются внутри `ExecutorService`, но на начальном этапе они не запускаются. Они ожидают задач для выполнения.

3. **Управление задачами**: `ExecutorService` управляет внутренней очередью задач. Когда вы подаете задачу на выполнение, она помещается в эту очередь и ожидает, пока не освободится поток для ее выполнения.

### Как работают потоки в пуле

1. **Ожидание задач**: Потоки в пуле обычно находятся в режиме ожидания задач. Когда появляется новая задача, один из ожидающих потоков активируется для ее выполнения.

2. **Выполнение задач**: Поток извлекает задачу из очереди и выполняет ее. После завершения задачи поток снова переходит в состояние ожидания новой задачи.

3. **Жизненный цикл потока**: Если пул потоков создан с помощью `newCachedThreadPool()`, потоки, которые не используются определенное время, могут быть уничтожены. Для пула с фиксированным размером потоки остаются активными до тех пор, пока не будет вызван метод `shutdown()`.

### Пул задач

- **Очередь задач**: Пул задач — это очередь, в которой хранятся задачи, ожидающие выполнения. `ExecutorService` использует эту очередь для управления задачами. Когда все потоки заняты, новые задачи помещаются в очередь до тех пор, пока не освободится поток.

- **Типы очередей**: В зависимости от конкретной реализации `ExecutorService`, может использоваться различные типы очередей (например, прямая очередь, приоритетная очередь и т.д.).

### Активация и выполнение потоков

- **Получение задачи**: Когда поток становится доступным, он извлекает задачу из очереди и начинает ее выполнение.

- **Цикл работы**: После завершения задачи поток возвращается к следующей задаче в очереди, если таковая имеется. Этот процесс продолжается до тех пор, пока не будет вызван метод `shutdown()`, который инициирует процесс завершения работы потоков.

Важно отметить, что `ExecutorService` не только упрощает управление потоками, но и повышает производительность за счет повторного использования потоков, что уменьшает накладные расходы на создание и уничтожение потоков.

Основные методы `ExecutorService`:

- `submit(Runnable)`: принимает объект `Runnable` и возвращает `Future`, представляющий будущий результат выполнения.
- `invokeAll(Collection<? extends Callable<T>>)`: выполняет данную коллекцию задач `Callable`.
- `invokeAny(Collection<? extends Callable<T>>)`: выполняет данную коллекцию задач `Callable` и возвращает результат одной из успешно выполненных задач.
- `shutdown()`: инициирует плавную остановку, в которой ранее отправленные задачи выполняются, но новые задачи не принимаются.
- `shutdownNow()`: пытается остановить все активно выполняющиеся задачи, приостанавливает обработку ожидающих задач и возвращает список задач, которые ждали выполнения.

Создадим `ExecutorService` для запуска нескольких потоков, каждый из которых будет выводить определенную букву в консоль в цикле:

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LetterPrinter {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Создаем пул из трех потоков

        // Запускаем три задачи для печати букв A, B и C в цикле
        executor.submit(() -> printLetter('A'));
        executor.submit(() -> printLetter('B'));
        executor.submit(() -> printLetter('C'));

        executor.shutdown(); // Инициируем плавное завершение работы исполнителя
    }

    private static void printLetter(char letter) {
        for (int i = 0; i < 10; i++) {
            System.out.println(letter);
            try {
                Thread.sleep(100); // Небольшая пауза для наглядности
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

В этом примере создается пул из трех потоков с помощью `Executors.newFixedThreadPool(3)`. 
Затем запускаются три задачи, каждая из которых печатает определенную букву (A, B или C) десять раз с паузой в 100 мс между печатью. 
После этого вызывается `shutdown()`, чтобы корректно завершить работу `ExecutorService` после выполнения всех задач.


</details>