package kr.itanoss.blogexamples.springcustomannotation

import org.springframework.context.annotation.Import

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Import(PerformanceMonitorConfiguration::class)
annotation class EnablePerformanceMonitor