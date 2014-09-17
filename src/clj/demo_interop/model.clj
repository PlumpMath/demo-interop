(ns demo-interop.model
	(:gen-class
      :name demo.model
      :methods [#^{:static true} [somemodel [String] String]]))

(defn -somemodel [s] (str "prefix-clojure(" s))