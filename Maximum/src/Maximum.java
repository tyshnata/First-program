import java.util.List;

public class Maximum {

    public  Integer maximumNum (Integer[] list){ //метод поиска наибольшего числа в списке
        Integer maxNumber = list[0];

        for(int i = 0; i < list.length ; i++){ // перебираем элементы массива, ищем Мах
            if ( maxNumber >= list[i] ){}
            else maxNumber = list[i];
        }
        return maxNumber; // возвращаем Мах элемент
    }


    public Integer getElement(List<Integer> list, Integer n){ //метод, возвращающий n-й элемент списка
        Integer number;
        if ( n < list.size()){  // если индекс не превышает размера списка
            number = list.get(n); // получаем значение элемента по индексу
        }
        else {
            number = -1; // иначе получаем со значением -1
        }
        return number; // возвращаем элемент с заданным индексом
    }


   public static Integer fibonacci(Integer n){ // метод, воввращающий n-й элемент последовательности Фибоначчи
        Integer fibElement = 0;
        Integer i1 = 0, i2 = 1;
        if (n == 0) {
            fibElement = 0; // элемент посл-ти Фибоначчи с индексом "0"
        }
        else {
            if (n == 1) {
                fibElement = 1; //элемент посл-ти Фибоначчи с индексом "1"
            }
            else {
                for (int i = 2; i <= n; i++) {
                    fibElement = i1 + i2;
                    i1 = i2;
                    i2 =  fibElement;

                }
            }
        }

        return fibElement; //элемент посл-ти Фибоначчи с индексом "n"
   }

}



