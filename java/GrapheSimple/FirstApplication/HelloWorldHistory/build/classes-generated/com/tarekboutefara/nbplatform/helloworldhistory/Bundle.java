package com.tarekboutefara.nbplatform.helloworldhistory;
/** Localizable strings for {@link com.tarekboutefara.nbplatform.helloworldhistory}. */
class Bundle {
    /**
     * @return <i>HelloWorldHistory</i>
     * @see HelloWorldHistoryTopComponent
     */
    static String CTL_HelloWorldHistoryAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_HelloWorldHistoryAction");
    }
    /**
     * @return <i>HelloWorldHistory Window</i>
     * @see HelloWorldHistoryTopComponent
     */
    static String CTL_HelloWorldHistoryTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_HelloWorldHistoryTopComponent");
    }
    /**
     * @return <i>This is a HelloWorldHistory window</i>
     * @see HelloWorldHistoryTopComponent
     */
    static String HINT_HelloWorldHistoryTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_HelloWorldHistoryTopComponent");
    }
    private Bundle() {}
}
