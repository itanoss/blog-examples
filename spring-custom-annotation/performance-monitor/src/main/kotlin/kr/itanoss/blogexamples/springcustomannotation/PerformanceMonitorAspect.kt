package kr.itanoss.blogexamples.springcustomannotation

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory

@Aspect
class PerformanceMonitorAspect {

    private val log = LoggerFactory.getLogger(this::class.java)

    @Around("@annotation(LogExecutionTime)")
    fun logExecutionTime(pjp: ProceedingJoinPoint): Any? {
        val signature = pjp.signature
        val typeName = signature.declaringType.simpleName
        val methodName = signature.name
        val start = System.currentTimeMillis()
        val result: Any?
        try {
            result = pjp.proceed()
        } finally {
            val end = System.currentTimeMillis()
            log.info("%s.%s() execution time : %dms".format(typeName, methodName, end - start))
        }
        return result
    }
}
