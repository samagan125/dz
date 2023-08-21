public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City(123, "Moscow"));
        cities.add(new City(987, "London"));
        cities.add(new City(-187, "New York"));
        cities.add(new City(234, "Bishkek"));
        cities.add(new City(345, "Bali"));
        TreeSet<City> cityTreeSet=new TreeSet<>(City.cityComparator);
        for (City city : cities) {
            if (city.getCode()%2==1) {
                cityTreeSet.add(city);
            }
        }
        for (City city:cityTreeSet) {
            System.out.println(city);
        }
    }
    }
}