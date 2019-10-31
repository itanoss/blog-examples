package kr.itanoss.blogexamples.springcustomannotation

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.EnableAspectJAutoProxy

@EnableAspectJAutoProxy
class PerformanceMonitorConfiguration {
    @Bean
    fun aspect() = PerformanceMonitorAspect()
}