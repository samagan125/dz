public class Citu {
    private int Code;
    private String name;
    static Comparator<Citu> cityComparator=new Comparator<Citu>() {
        @Override
        public int compare(City o1, City o2) {
            return o2.getCode()- o1.getCode();
        }
    };

    public City(int code, String name) {
        Code = code;
        this.name = name;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Code == city.Code && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Code, name);
    }

    @Override
    public String toString() {
        return "City{" +
                "Code=" + Code +
                ", name='" + name + '\'' +
                '}'+'\n';
    }
}
}
