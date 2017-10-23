# μG

[![Build Status](https://travis-ci.org/hedlx/mug.svg?branch=master)](https://travis-ci.org/hedlx/mug)

Wannabe music synthesizer.

## Setup
To build npm dependencies run:

    npm install
    npm run build

To get an interactive development environment run:

    lein figwheel
    lein garden auto

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL.

## License

Copyright 2017 [contributors](https://github.com/hedlx/mug/contributors).

Distributed under the [MIT](https://opensource.org/licenses/MIT) license.
