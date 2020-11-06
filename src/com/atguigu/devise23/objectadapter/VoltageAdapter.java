package com.atguigu.devise23.objectadapter;

//ÊÊÅäÆ÷Àà
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int i = voltage220V.output220V() / 44;
        return i;
    }
}
