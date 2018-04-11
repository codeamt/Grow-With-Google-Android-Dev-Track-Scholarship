package com.example.android.boardingpass.databinding;
import com.example.android.boardingpass.R;
import com.example.android.boardingpass.BR;
import android.view.View;
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(30);
        sIncludes.setIncludes(1, 
            new String[] {"flight_info", "boarding_info"},
            new int[] {2, 3},
            new int[] {R.layout.flight_info, R.layout.boarding_info});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewPassengerLabel, 4);
        sViewsWithIds.put(R.id.textViewPassengerName, 5);
        sViewsWithIds.put(R.id.leftRectangle, 6);
        sViewsWithIds.put(R.id.divider, 7);
        sViewsWithIds.put(R.id.rightRectangle, 8);
        sViewsWithIds.put(R.id.textViewOriginAirport, 9);
        sViewsWithIds.put(R.id.textViewDestinationAirport, 10);
        sViewsWithIds.put(R.id.imagePlane, 11);
        sViewsWithIds.put(R.id.textViewFlightCode, 12);
        sViewsWithIds.put(R.id.textViewBoardingTimeLabel, 13);
        sViewsWithIds.put(R.id.textViewBoardingTime, 14);
        sViewsWithIds.put(R.id.textViewDepartureTimeLabel, 15);
        sViewsWithIds.put(R.id.textViewDepartureTime, 16);
        sViewsWithIds.put(R.id.textViewBoardingInTimeLabel, 17);
        sViewsWithIds.put(R.id.textViewBoardingInCountdown, 18);
        sViewsWithIds.put(R.id.textViewArrivalTimeLabel, 19);
        sViewsWithIds.put(R.id.textViewArrivalTime, 20);
        sViewsWithIds.put(R.id.tableHeaderImage, 21);
        sViewsWithIds.put(R.id.tableImage, 22);
        sViewsWithIds.put(R.id.textViewTerminalLabel, 23);
        sViewsWithIds.put(R.id.textViewGateLabel, 24);
        sViewsWithIds.put(R.id.textViewSeatLabel, 25);
        sViewsWithIds.put(R.id.textViewTerminal, 26);
        sViewsWithIds.put(R.id.textViewGate, 27);
        sViewsWithIds.put(R.id.textViewSeat, 28);
        sViewsWithIds.put(R.id.barcode, 29);
    }
    // views
    private final android.support.constraint.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[29]
            , (com.example.android.boardingpass.databinding.BoardingInfoBinding) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (com.example.android.boardingpass.databinding.FlightInfoBinding) bindings[2]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[18]
            , null
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[23]
            );
        this.mboundView1 = (android.support.constraint.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        flightInfo.invalidateAll();
        boardingInfo.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (flightInfo.hasPendingBindings()) {
            return true;
        }
        if (boardingInfo.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBoardingInfo((com.example.android.boardingpass.databinding.BoardingInfoBinding) object, fieldId);
            case 1 :
                return onChangeFlightInfo((com.example.android.boardingpass.databinding.FlightInfoBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBoardingInfo(com.example.android.boardingpass.databinding.BoardingInfoBinding boardingInfo, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeFlightInfo(com.example.android.boardingpass.databinding.FlightInfoBinding flightInfo, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        flightInfo.executePendingBindings();
        boardingInfo.executePendingBindings();
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): boardingInfo
        flag 1 (0x2L): flightInfo
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}