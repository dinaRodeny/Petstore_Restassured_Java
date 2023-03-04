package Pojo;
public class Category
{
        private Integer id;
        private String name;
        /**
         * No args constructor for use in serialization
         *
         */
        public Category() {
        }

        /**
         *
         * @param name
         * @param id
         */
        public Category(Integer id, String name) {
            super();
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


