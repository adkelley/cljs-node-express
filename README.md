# pow

Example of NodeJS/ExpressJS using ClojureScript.  Adapted from [mase.io](http://www.mase.io/code/clojure/node/2015/01/24/getting-started-with-clojurecript-and-node/) by updating for latest version of ClojureScript and lein meis build tools

## Overview

FIXME: Write a paragraph about the library/project and highlight its goals.

## Setup

Build your project once in dev mode with the following script and then open `index.html` in your browser.

    ./scripts/build

To auto build your project in dev mode:

    ./script/watch

To start an auto-building Node REPL (requires
[rlwrap](http://utopia.knoware.nl/~hlub/uck/rlwrap/), on OS X
installable via brew):

    ./scripts/repl

To get source map support in the Node REPL:

    lein npm install
    
this will also pull down ExpressJS
    
To start a browser REPL:
    
1. Uncomment the following lines in src/pow/server/core.cljs:
```clojure
;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))
```
2. Run `./scripts/brepl`
3. Browse to `http://localhost:9000` (you should see `Hello world!` in the web console)
4. (back to step 3) you should now see the REPL prompt: `cljs.user=>`
5. You may now evaluate ClojureScript statements in the browser context.
    
For more info using the browser as a REPL environment, see
[this](https://github.com/clojure/clojurescript/wiki/The-REPL-and-Evaluation-Environments#browser-as-evaluation-environment).
    
Clean project specific out:

    lein clean
     
Build a single release artifact with the following script and then open `index_release.html` in your browser.

    ./scripts/release

## License

Copyright © 2015 Alex Kelley

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
