package homeworkles14;

//створюємо клас ConsolePrinter, який реалізує інтерфейс Printer
//implements Printer означає, що цей клас зобов’язаний реалізувати метод print()
class ConsolePrinter implements Printer {

    //створюємо внутрішній клас Message всередині ConsolePrinter
    public static class Message {
        //зберігаємо текст повідомлення та імя відправника
        private String text;
        private String sender;

        //Створюємо конструктор, який приймає текст і відправника
        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        //Геттери - повертають значення відповідних змінних
        //Сеттери - змінюють значення відповідних змінних
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    // @Override – означає, що цей метод перевизначає метод із інтерфейсу Printer
    @Override
    //отримуємо обєкт Message і виводимо його на екран
    public void print(Message message) {
        //Якщо message.getText() та message.getSender() одночасно null, то створюється анонімний клас (клас без імені)
        if (message.getText() == null && message.getSender() == null) {
            // Анонімний клас для обробки пустого повідомлення, який одразу реалізує метод print()
            Printer anonymousHandler = new Printer() {
                @Override
                //при виконвнні даних умов виводимо даний текст
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousHandler.print(message); // викликає метод print() у анонімного класу
            //2 випадок якщо навідомий тільки відправник
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
            // 3 випадок коли відомий і відправник і текст
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}
