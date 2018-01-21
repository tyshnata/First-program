import java.util.List;

public class Maximum {

    public  Integer maximumNum (Integer[] arrlist){ //метод поиска наибольшего числа в списке
        Integer maxNumber = arrlist[0];

        for(int i = 0; i < arrlist.length ; i++){ // перебираем элементы массива, ищем Мах
            if ( maxNumber >= arrlist[i] ){}
            else maxNumber = arrlist[i];
        }
        return maxNumber; // возвращаем Мах элемент
    }

    public static Integer getElement(List<Integer> list, Integer n){ //метод, возвращающий n-й элемент списка
        Integer number;
        if ( n < list.size()){  // если индекс не превышает размера списка
            number = list.get(n); // получаем значение элемента по индексу
        }
        else {
            number = -1; // иначе получаем со значением -1
        }
        return number; // возвращаем элемент с заданным индексом
    }






