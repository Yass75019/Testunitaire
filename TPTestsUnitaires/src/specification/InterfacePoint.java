package specification;

public interface InterfacePoint
{
        public int getOrd();
        public int getAbs();
        public void setOrd(int ord);
        public void setAbs(int ord);

        /**
         *
         * Retourne la somme des deux points.
         */
        public InterfacePoint add(InterfacePoint p);
}