public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) {
        // Вычислить и вернуть минимальный из трех полученных аргументов (first, second, third)
        // ------------------------------------------------------------------------------------
            int min = first;
            if (second < min) {
                min = second;
            }
            if (third < min) {
                min = third;
            }
            return min;
// Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public boolean subtask_2_if(int year) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }


    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {
        // Проверить, лежит ли точка с координатами (x, y) внутри невырожденного квадрата
        // со сторонами, параллельными осям координат, левый верхний угол которого имеет
        // координаты (left_up_x, left_up_y), ширина которого width, высота height.
        // Точка на границе считается не лежащей внутри.
        // В качестве результата вернуть:
        // 0 - не лежит
        // 1 - лежит
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        // Замените данный оператор кодом, решающим поставленную задачу.
        double upper_point = left_up_x+width;
        double the_left_point = left_up_y-height;
        if(width == height)
            if((upper_point - x <= 0.000001 || x-left_up_x <= 0.000001) || (left_up_y-y <= 0.000001 || y-the_left_point <= 0.000001))
                return  0;
            else
        if(x > left_up_x && x < upper_point && y < left_up_y && y > the_left_point)
            return  1;
            else
        return  0;
            else
        return  2;
    }



    @Override
    public int subtask_4_ (double x0, double y0, double k, double b) {
        // Проверить, как расположена точка с координатами (x0, y0)
        // относительно прямой y = kx + b
        // В качестве результата вернуть:
        // 0 - лежит выше прямой
        // 1 - лежит ниже прямой
        // 2 - лежит на прямой
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        // Замените данный оператор кодом, решающим поставленную задачу.
        double y = k * x0 + b;
        if (y0 - y > 0.000001) {
            return 0; // point lies above the line
        } else if (y - y0 > 0.000001) {
            return 1; // point lies below the line
        } else {
            return 2; // point lies on the line
        }

    }
    @Override
    public String subtask_5_switch(int day_od_week) {
        // По номеру дня недели day_od_week вернуть его название на русском языке, записанное
        // с большой буквы. Дни едели отсчитываются с единицы. Если номер задан некорректно,
        // вернуть строку "Ошибка"

    String day = "Ошибка";
        switch (day_od_week) {
        case 1 -> day = "Понедельник";
        case 2 -> day = "Вторник";
        case 3 -> day = "Среда";
        case 4 -> day = "Четверг";
        case 5 -> day = "Пятница";
        case 6 -> day = "Суббота";
        case 7 -> day = "Воскресенье";
    }
        return day;
}
    @Override
    public String subtask_6_switch(int direction) {
        // По заданному направлению direction вернуть его название:
        // 1 - север
        // 2 - юг
        // 3 - запад
        // 4 - восток
        // Во всех остальных случаях вернуть пустую строку
        // ------------------------------------------------------------------------------------
        return ""; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
        int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
            if (abs(time - 0) < 0.000001 || abs(speed - 0) < 0.000001 || abs(vx - 0) < 0.000001 || abs(vy - 0) < 0.000001 || abs(vz - 0) < 0.000001) {
                return 2;
            }

            double x = vx * time * speed;
            if (x >= wall) {
                return 1;
            } else {
                return 0;
            }
        }

    }
    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
        // Проверить, как друг относительно друга располагаются прямые y = k1*x + b1 и
        // y = k2*x + b2. Вернуть
        // 1 - если параллельны
        // 2 - если пересекаются
        // 3 - если совпадают
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        // Замените данный оператор кодом, решающим поставленную задачу.


