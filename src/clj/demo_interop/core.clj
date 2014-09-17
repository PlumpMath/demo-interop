(ns demo-interop.core
	(:import com.somej.Ahoy)
	(:gen-class))



(defn -main [& args]
	(println (Ahoy/prefix2 (apply str args))))