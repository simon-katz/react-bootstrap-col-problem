# A Problem I'm Having with react-bootstrap 2.0.0-rc.0

This repo demonstrates a problem I'm having with react-bootstrap 2.0.0-rc.0

When I try to load "react-bootstrap/Col", I get the following error:

```
ExceptionInfo: failed to convert sources
Caused by:
NullPointerException: NAME $jscomp 66:8  [length: 96] [source_file: node_modules/react-bootstrap/cjs/Col.js]
```

There's no problem loading other react-bootstrap modules (is that the right word?).

This is a shadow-cljs project.

To reproduce:

* Run `_scripts/clean-dev; _scripts/cljs-dev-auto`.

* When compilation is complete, point a browser at http://localhost:8280/

* To cause the error, edit the file "src/ui.cljs": uncomment the require of ["react-bootstrap/Col"].
