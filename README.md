# A Problem I'm Having with react-bootstrap 2.0.0-rc.0


**NB: Problem fixed by adding `:js-options {:entry-keys ["module" "browser" "main"]}` to shadow-cljs.edn**

See [answer to my question about this on Slack](https://clojurians.slack.com/archives/C0620C0C8/p1634243261179700?thread_ts=1634212661.178000&cid=C0620C0C8). Thanks to [p-himik](https://clojurians.slack.com/team/U2FRKM4TW)

**Old notes:**

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
