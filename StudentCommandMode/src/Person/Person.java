package Person;

public interface Person {
    public String getId(String id);
    public String getName(String name);
    public int compute_salary();
    public int compute_ot(int hours, int rates);
    public int compute_ot(int hours);
    public default int compute_tax(int income) {
        // อัตราภาษีแต่ละช่วง
        float[] taxRates = {0, 5, 10, 15, 20, 25, 30};

        // ช่วงภาษีที่ใช้คำนวณ
        float[] incomeRanges = {150000, 150000, 200000, 250000, 250000, 1000000, 3000000};

        // ยอดเงินภาษี
        double taxAmount = 0;

        // วนลูปคำนวณภาษี
        for (int i = 0; i < taxRates.length; i++) {
            if (income <= 0) {
                break;
            }
            float taxableIncomeInThisRange = Math.min(income, incomeRanges[i]);
            taxAmount += (taxableIncomeInThisRange * (taxRates[i] / 100));
            income -= (int) incomeRanges[i];
        }

        // คืนค่ายอดเงินภาษี
        return (int) taxAmount;
    }
}
