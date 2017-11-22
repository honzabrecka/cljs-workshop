(use 'figwheel-sidecar.repl-api)

(def config
  {:server-port     3478
   :builds          (figwheel-sidecar.config/get-project-builds)
   :builds-to-start ["dev"]})

(start-figwheel! config)
(cljs-repl)
