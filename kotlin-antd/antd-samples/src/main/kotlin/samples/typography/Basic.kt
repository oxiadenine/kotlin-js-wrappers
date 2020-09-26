package samples.typography

import antd.divider.divider
import antd.typography.paragraph
import antd.typography.text
import antd.typography.title
import antd.typography.typography
import react.RBuilder
import react.dom.a
import react.dom.li
import react.dom.ul
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +TypographyStyles.basic }
        typography {
            title { +"Introduction" }
            paragraph {
                +"""
                    In the process of internal desktop applications development, many different design specs and
                    implementations would be involved, which might cause designers and developers difficulties and
                    duplication and reduce the efficiency of development.
                """.trimIndent()
            }
            paragraph {
                +"""
                    After massive project practice and summaries, Ant Design, a design language for background
                    applications, is refined by Ant UED Team, which aims to 
                """.trimIndent()
                text {
                    attrs.strong = true
                    +"""
                        uniform the user interface specs for internal background projects, lower the unnecessary
                        cost of design differences and implementation and liberate the resources of design and
                        front-end development
                    """.trimIndent()
                }
                +"."
            }
            title {
                attrs.level = 2
                +"Guidelines and Resources"
            }
            paragraph {
                +"We supply a series of design principles, practical patterns and high quality design resources ("
                text {
                    attrs.code = true
                    +"Sketch"
                }
                +" and "
                text {
                    attrs.code = true
                    +"Axure"
                }
                +"), to help people create their product prototypes beautifully and efficiently."
            }
            paragraph {
                ul {
                    li {
                        a {
                            attrs.href = "/docs/spec/proximity"
                            +"Principles"
                        }
                    }
                    li {
                        a {
                            attrs.href = "/docs/pattern/navigation"
                            +"Patterns"
                        }
                    }
                    li {
                        a {
                            attrs.href = "/docs/resource/download"
                            +"Resource Download"
                        }
                    }
                }
            }
            divider {}
            title { +"介绍" }
            paragraph {
                +"的企业级产品是一个庞大且复杂的体系。这类产品不仅量级巨大且功能复杂，而且变动和并发频繁，常常需要设计与开发能够快速的做出响应。同时这类产品中有存在很多类似的页面以及组件，可以通过抽象得到一些稳定且高复用性的内容,"
            }
            paragraph {
                +"""
                    随着商业化的趋势，越来越多的企业级产品对更好的用户体验有了进一步的要求。带着这样的一个终极目标，我们（蚂蚁金服体验技术部）经过大量的项目实践和总结，逐步打磨出一个服务于企业级产品的设计体系
                    Ant Design。基于
                """.trimIndent()
                text {
                    attrs.mark = true
                    +"『确定』和『自然』"
                }
                +"的设计价值观，通过模块化的解决方案，降低冗余的生产成本，让设计者专注于"
                text {
                    attrs.strong = true
                    +"更好的用户体。"
                }
            }
            title {
                attrs.level = 2
                +"设计资源"
            }
            paragraph {
                +"我们提供完善的设计原则、最佳实践和设计资源文件 ("
                text {
                    attrs.code = true
                    +"Sketch"
                }
                +" 和 "
                text {
                    attrs.code = true
                    +"Axure"
                }
                +") ，来帮助业务快速设计出高质量的产品原型。"
            }
            paragraph {
                ul {
                    li {
                        a {
                            attrs.href = "/docs/spec/proximity"
                            +"原则"
                        }
                    }
                    li {
                        a {
                            attrs.href = "/docs/pattern/navigation"
                            +"模式"
                        }
                    }
                    li {
                        a {
                            attrs.href = "/docs/resource/download"
                            +"设计资源"
                        }
                    }
                }
            }
        }
    }
}
