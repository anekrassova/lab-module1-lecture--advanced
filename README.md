# lab-module1-lecture--advanced
**Task 1: Immutable**
Для этого задания был изменен класс Student: классу и его полям добавлен модификатор final, добавлен параметризованный конструктор, убраны сеттеры, переопределен метод toString.
<img width="665" height="678" alt="Снимок экрана 2026-01-06 в 19 19 48" src="https://github.com/user-attachments/assets/59ac933c-b43d-4cde-bcec-f738defc33e7" />

Результат:

Такой синтаксис не работает:
<img width="842" height="291" alt="Снимок экрана 2026-01-06 в 19 24 50" src="https://github.com/user-attachments/assets/7d48db94-623f-4de4-81de-c689ff3e8759" />

Создание инстанса через параметризованный конструктор работает и вывод в читаемом виде:
<img width="789" height="357" alt="Снимок экрана 2026-01-06 в 19 25 36" src="https://github.com/user-attachments/assets/5b680230-bb06-4e00-8c6c-522a4f5d72cd" />

Наследование запрещено:
<img width="904" height="431" alt="Снимок экрана 2026-01-06 в 19 26 46" src="https://github.com/user-attachments/assets/5c4808af-f2cd-4723-9104-2e08086034dc" />

**Task 2 : Record**
Для этого задания был измене класс Order: добавлена валидация в конструктор.
<img width="956" height="320" alt="Снимок экрана 2026-01-06 в 20 11 01" src="https://github.com/user-attachments/assets/1befc84e-980c-429f-b6c7-9c114106cbae" />

Теперь вводить некоректные данные запрещено:
<img width="1121" height="358" alt="Снимок экрана 2026-01-06 в 20 12 52" src="https://github.com/user-attachments/assets/62cf0416-4a9c-4e6a-a1b6-3facece730b3" />

**Task 3: Lambda**
Через лямбду добавлена реализация метода send(Email email) для функционального интерфейса EmailSender:
<img width="600" height="45" alt="Снимок экрана 2026-01-06 в 20 18 01" src="https://github.com/user-attachments/assets/a546aa13-f9f8-48f8-8834-81c684be1ad4" />

Написана реализация метода sendEmails, который формирует инстанс эмейла из исходных данных и на каждом инстансе вызывает метод отправки. Данный метод преобразует список клиентов в поток через Stream API. Для каждого инстанса Customer создается инстанс Email с помощью map, forEach вызывает send на каждом полученном инстансе Email.
<img width="1153" height="129" alt="Снимок экрана 2026-01-06 в 20 18 14" src="https://github.com/user-attachments/assets/500229aa-3e73-451b-a21d-dd7ad6b89b7b" />

Вывод в консоли:
<img width="553" height="136" alt="Снимок экрана 2026-01-06 в 20 20 12" src="https://github.com/user-attachments/assets/b0396019-22e9-45a1-b004-d2296f11e060" />
