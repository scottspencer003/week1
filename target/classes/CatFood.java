public class CatFood {

        private CansPerDay cansPerDay;
        private CostPerCan costPerCan;



        public CatFood (CostPerCan costPerCan, CansPerDay cansPerDay) {
            this.cansPerDay = cansPerDay;
            this.costPerCan = costPerCan;
        }


        public double CostPerYear {
            return ( (double) costPerCan * (double) cansPerDay ) * 365;
        }

        public int MealsPerYear {
            return ( (int) cansPerDay * 365);
    }


}
