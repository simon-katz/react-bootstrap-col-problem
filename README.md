# Problems with "react-bootstrap/Col" in react-bootstrap 2.0.0-rc.0

(See the shadow-cljs issue at https://github.com/thheller/shadow-cljs/issues/948)

This is a shadow-cljs project.

To reproduce the problem:

Run the following:

```
npm install
_scripts/clean-dev; _scripts/cljs-dev-auto
```

When compilation is complete, point a browser at http://localhost:8281/

In the `ui` namespace, there’s a var called demo-col-error? If false, the UI displays with no error. If true, I get the following error:

```
Uncaught TypeError: $jscomp.makeIterator is not a function
    at eval (Col.js:66)
    at renderWithHooks (react-dom.development.js:14986)
    at updateForwardRef (react-dom.development.js:17045)
    at beginWork (react-dom.development.js:19099)
    at HTMLUnknownElement.callCallback (react-dom.development.js:3946)
    at Object.invokeGuardedCallbackImpl (react-dom.development.js:3995)
    at invokeGuardedCallback (react-dom.development.js:4057)
    at beginWork$1 (react-dom.development.js:23965)
    at performUnitOfWork (react-dom.development.js:22780)
    at workLoopSync (react-dom.development.js:22708)
```

A second problem (not sure if this is related): If I remove `["react-bootstrap/Col" :default rb-Col]` from the `(:require ...)` form, and also remove the things that use rb-Col, then initial from-scratch compilation is fine, but if I then re-introduce the require of "react-bootstrap/Col" incremental recompilation gives the following error:

```
NullPointerException: NAME $jscomp 66:8  [length: 96] [source_file: node_modules/react-bootstrap/cjs/Col.js]
```
