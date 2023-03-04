package Pojo;

public class tags
{
        private Integer id;
        private String name;

        /**
         * No args constructor for use in serialization
         *
         */
        public tags() {
        }

        /**
         *
         * @param name
         * @param id
         */
        public tags(Integer id, String name)
        {
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
        public void set_All(Integer id, String name)
        {
        this.id = id;
        this.name = name;
    }
    }

