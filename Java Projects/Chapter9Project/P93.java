    
    /**
     * Write a description of class P93 here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */public class P93 {
        protected String description;
        protected int day, month, year;
        public P93(String desc, int d, int m, int y) {
            description = desc;
            day = d;
            month = m;
            year = y;
        }    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
        public int getDay() {
            return day;
        }
        public void setDay(int day) {
            this.day = day;
        }
        public int getMonth() {
            return month;
        }
        public void setMonth(int month) {
            this.month = month;
        }
        public int getYear() {
            return year;
        }
            public void setYear(int year) {
                this.year = year;
            }
            public boolean occursOn(int d, int m, int y)
            {
                if(getDay() == d && getMonth() == m && getYear() == y) {
                    return true;
                }
                else {
                    return false;
                }
            }
            public String toString()
            {
                return description +" on "+day +"/"+month+"/"+year ;
            }
        }
        public class OneTime extends P9D3 {
            public OneTime(String desc, int d, int m, int y) {
                super(desc, d, m, y);
            }
            public String toString()
            {
                return "[OneTime] "+super.toString();
            }
        }
        public class Monthly extends P9D3 {
            public Monthly(String desc, int d, int m, int y) {
                super(desc, d, m, y);
            }
            public boolean occursOn(int d, int m, int y)
            {
                if(getDay() == d) //since this is monthly appointment , we only need to check if the day matches
                    return true;
                else
                    return false;
            }
            public String toString()
            {
                return "[Monthly] "+description+" on day "+day+" of the month";
            }
        }
        public class Daily extends P9D3 {
    		public Daily(String desc, int d, int m, int y) {
    			super(desc, d, m, y);
    		}
    		public boolean occursOn(int d, int m, int y)
    		{
    			return true; //since it occurs daily, there is no need to check day, month or year
    		}
    		public String toString()
    		{
    			return "[Daily]"+description;
		}
}
