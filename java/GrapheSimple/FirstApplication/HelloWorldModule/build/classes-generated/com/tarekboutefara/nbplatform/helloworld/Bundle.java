package com.tarekboutefara.nbplatform.helloworld;
/** Localizable strings for {@link com.tarekboutefara.nbplatform.helloworld}. */
class Bundle {
    /**
     * @return <i>HelloWorld</i>
     * @see HelloWorldTopComponent
     */
    static String CTL_HelloWorldAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_HelloWorldAction");
    }
    /**
     * @return <i>HelloWorld Window</i>
     * @see HelloWorldTopComponent
     */
    static String CTL_HelloWorldTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_HelloWorldTopComponent");
    }
    /**
     * @return <i>This is a HelloWorld window</i>
     * @see HelloWorldTopComponent
     */
    static String HINT_HelloWorldTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_HelloWorldTopComponent");
    }
    private Bundle() {}
}
