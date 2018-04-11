package com.example.android.boardingpass.databinding;
import com.example.android.boardingpass.R;
import com.example.android.boardingpass.BR;
import android.view.View;
public class BoardingInfoBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tableHeaderImage, 1);
        sViewsWithIds.put(R.id.tableImage, 2);
        sViewsWithIds.put(R.id.textViewTerminalLabel, 3);
        sViewsWithIds.put(R.id.textViewGateLabel, 4);
        sViewsWithIds.put(R.id.textViewSeatLabel, 5);
        sViewsWithIds.put(R.id.textViewTerminal, 6);
        sViewsWithIds.put(R.id.textViewGate, 7);
        sViewsWithIds.put(R.id.textViewSeat, 8);
    }
    // views
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.ImageView tableHeaderImage;
    public final android.widget.ImageView tableImage;
    public final android.widget.TextView textViewGate;
    public final android.widget.TextView textViewGateLabel;
    public final android.widget.TextView textViewSeat;
    public final android.widget.TextView textViewSeatLabel;
    public final android.widget.TextView textViewTerminal;
    public final android.widget.TextView textViewTerminalLabel;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BoardingInfoBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.tableHeaderImage = (android.widget.ImageView) bindings[1];
        this.tableImage = (android.widget.ImageView) bindings[2];
        this.textViewGate = (android.widget.TextView) bindings[7];
        this.textViewGateLabel = (android.widget.TextView) bindings[4];
        this.textViewSeat = (android.widget.TextView) bindings[8];
        this.textViewSeatLabel = (android.widget.TextView) bindings[5];
        this.textViewTerminal = (android.widget.TextView) bindings[6];
        this.textViewTerminalLabel = (android.widget.TextView) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static BoardingInfoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BoardingInfoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<BoardingInfoBinding>inflate(inflater, com.example.android.boardingpass.R.layout.boarding_info, root, attachToRoot, bindingComponent);
    }
    public static BoardingInfoBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BoardingInfoBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.android.boardingpass.R.layout.boarding_info, null, false), bindingComponent);
    }
    public static BoardingInfoBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BoardingInfoBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/boarding_info_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new BoardingInfoBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}