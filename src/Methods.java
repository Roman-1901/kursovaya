public class Methods {

    public static void informationOfEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static void sumOfMonth(Employee[] array) {
        System.out.println("Сумма затрат на зарплаты за месяц: " + String.format("%.2f", calculationOfSum(array)) + "руб.");
    }

    public static double calculationOfSum(Employee[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getSalary();
        }
        return sum;
    }


    public static void sumByDepartment(Employee[] array, int numDepartment) {
        System.out.println("Сумма затрат на зарплаты по отделу " + numDepartment + ": " + String.format("%.2f", calculationOfSumByDepartment(array, numDepartment)) + "руб.");
    }
    public static double calculationOfSumByDepartment(Employee[] array, int numDepartment) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == numDepartment) {
                sum += array[i].getSalary();
            }
        }
        return sum;
    }

    public static void avgByDepartment(Employee[] array, int numDepartment) {
        double sum = calculationOfSumByDepartment(array, numDepartment);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == numDepartment) {
                count += 1;
            }
        }
        System.out.println("Средняя зарплата по отделу " + numDepartment + " равна "+ sum/count);
    }

    public static void indexByDepartment(Employee[] array, int numDepartment, double percent) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == numDepartment) {
                array[i].setSalary(array[i].getSalary() + array[i].getSalary()/100*percent);
            }
        }
    }

    public static void employeesByDepartment(Employee[] array, int numDepartment) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == numDepartment) {
                System.out.println(array[i].getId()+" "+array[i].getSurName()+" "+array[i].getName()+" "+array[i].getFatherName()
                +" "+ array[i].getSalary());
            }
        }
    }

    public static void numEqualOne(Employee[] array, int num) {
        for (int i =0; i < array.length; i++) {
            if (array[i].getSalary() < num) {
                System.out.println(array[i].toString());
            }
        }
    }

    public static void numEqualTwo(Employee[] array, int num) {
        for (int i =0; i < array.length; i++) {
            if (array[i].getSalary() >= num) {
                System.out.println(array[i].toString());
            }
        }
    }
    public static void minSalaryByDepartment(Employee[] array, int numDepartment) {
        double min = calculationOfSum(array);
        System.out.println("Сотрудники отдела "+numDepartment+" с минимальной зарплатой:");
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == numDepartment && array[i].getSalary() <= min) {
                min = array[i].getSalary();
            }
        }
        minMaxSalaryByDepartment(array,numDepartment,min);
    }

        public static void maxSalaryByDepartment (Employee[]array, int numDepartment){
            double max = 0;
            System.out.println("Сотрудники отдела "+numDepartment+" с максимальной зарплатой:");
                for (int i = 0; i < array.length; i++) {
                    if (array[i].getDepartment() == numDepartment && array[i].getSalary() >= max) {
                        max = array[i].getSalary();
                    }
                }
                minMaxSalaryByDepartment(array,numDepartment,max);
        }

    public static void minMaxSalaryByDepartment(Employee[]array, int numDepartment, double salary) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == numDepartment && array[i].getSalary() == salary) {
                System.out.println("ФИО: " + array[i].getSurName() + " " + array[i].getName() + " " + array[i].getFatherName() +
                        ", Зарплата: " + String.format("%.2f", array[i].getSalary()) + "руб.");
            }
        }
    }



        //--------------Расчет минимальной зарплаты и вывод сотрудников методом minMaxOfSalary()
        public static void minSalary (Employee[]array){
            double min = array[0].getSalary();
            System.out.println("Сотрудники с минимальной зарплатой: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i].getSalary() <= min) {
                    min = array[i].getSalary();
                }
            }
            minMaxOfSalary(min, array);
        }

        //----------------Расчет максимальной зарплаты и вывод сотрудников методом minMaxOfSalary()
        public static void maxSalary (Employee[]array){
            double max = array[0].getSalary();
            System.out.println("Сотрудники с максимальной зарплатой: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i].getSalary() >= max) {
                    max = array[i].getSalary();
                }
            }
            minMaxOfSalary(max, array);
        }

        //----------------Данный метод выводит список сотрудников по переданным параметрам зарплаты
        public static void minMaxOfSalary ( double salary, Employee[] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i].getSalary() == salary) {
                    System.out.println("ФИО: " + array[i].getSurName() + " " + array[i].getName() + " " + array[i].getFatherName() +
                            ", Зарплата: " + String.format("%.2f", array[i].getSalary()) + "руб.");
                }
            }
        }


        public static void avgSalary (Employee[]array){
            System.out.println("Среднее значение зарплат: " + String.format("%.2f", calculationOfSum(array) / array.length));
        }

        public static void allFullNames (Employee[]array){
            System.out.println("ФИО всех сотрудников: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].getSurName() + " " + array[i].getName() + " " + array[i].getFatherName());
            }
        }

        public static void indexOfSalary (Employee[]array){
            for (int i = 0; i < array.length; i++) {
                array[i].setSalary(array[i].getSalary() * 1.05);
            }
        }
    }


